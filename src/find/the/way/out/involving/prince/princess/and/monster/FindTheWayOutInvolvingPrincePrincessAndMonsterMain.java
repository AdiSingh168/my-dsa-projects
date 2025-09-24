package find.the.way.out.involving.prince.princess.and.monster;

public class FindTheWayOutInvolvingPrincePrincessAndMonsterMain {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 2, 2, 2, 2, 2, 0},
                {0, 2, 1, 0, 0, 2, 0},
                {0, 2, 2, 2, 0, 2, 0},
                {0, 0, 0, 0, 0, 2, 0},
                {2, 2, 2, 2, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };

        FindTheWayOutInvolvingPrincePrincessAndMonster solution = new FindTheWayOutInvolvingPrincePrincessAndMonster();
        System.out.println(solution.solution(matrix, 6, 0, 6, 6));
    }

}
