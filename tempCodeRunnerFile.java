 pivot) {
                i++;
            }

            while (i <= j && arr[i] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }