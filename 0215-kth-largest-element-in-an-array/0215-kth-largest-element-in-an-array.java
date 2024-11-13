class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i: nums){
            heap.offer(i);
            if(heap.size()>k){
                heap.poll();
            }
        }

        return heap.poll();
    }
}