function solution(my_string) {
    const answer = [];
    
    my_string.replace(/[a-z]/g, '').split('').forEach(v => {
       answer.push(Number(v)); 
    });
    
    answer.sort();
    
    return answer;
}
