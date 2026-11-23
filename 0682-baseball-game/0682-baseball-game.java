class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        int div=1;
        for(String i: operations){
           
            if(i.equals("C") && !st.isEmpty()){
                st.pop();
            }
            else if(i.equals("D")){
                st.push(2*st.peek());
            }
            else if(i.equals("+")){
                int top = st.get(st.size() - 1);
                int secondTop = st.get(st.size() - 2);
                st.push(top + secondTop);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int t=0;
        for(int i : st){
            t+=i;
        }
        return t;
}
}