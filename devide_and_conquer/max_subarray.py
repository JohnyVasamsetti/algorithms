def Cross_Sum(array,p,mid,q):
	lts = 0
	lbs = 0
	lbsp = 0
	i = mid
	while(i>=p):
		lts += array[i]
		if (lts > lbs):
			lbs = lts
			lbsp = i
		i-=1
	rts = 0
	rbs = 0
	rbsp = 0
	j = mid + 1
	while(j<=q):
		rts += array[j]
		if (rts > rbs):
			rbs = rts
			rbsp = j
		j+=1
	return (lbs + rbs)

def solve(array,p,q):
	# Small
	if (p == q): # if only one element then retutn itself.
		return array[p]
	# Devide
	mid = (p + q)//2
	# Conquer
	Left = solve(array,p,mid)
	Right = solve(array,mid+1,q)
	# Combine
	Cross = Cross_Sum(array,p,mid,q)
	return max(Left,Right,Cross)
array = [20,-25,130,-80,10,90,-43,12,-40]
print ( solve(array,0,len(array)-1) )