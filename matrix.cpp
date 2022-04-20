class Solution
{
public:
    vector<int> luckyNumbers(vector<vector<int>> &matrix)
    {
        vector<int> ans;

        int index = -1;

        for (int i = 0; i < matrix.size(); i++)
        {

            int mini = INT_MAX;

            for (int j = 0; j < matrix[0].size(); j++)
            {

                if (matrix[i][j] < mini)
                {
                    index = i;
                }
            }
            for (int k = 0; k < matrix[0].size(); k++)
            {
                int maxi = INT_MIN;

                if (matrix[index][k] > maxi)
                {
                    maxi = matrix[index][k];
                }
                if (maxi == mini)
                {
                    return maxi;
                }
            }
        }
    }
}

;