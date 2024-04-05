            count += k - j - 1
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

def triangle_number(nums):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    for j in range(i + 1, len(nums) - 1):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    count = 0
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    nums.sort()
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

        k = i + 2
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

            while k < len(nums) and nums[i] + nums[j] > nums[k]:
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    return count
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length


    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

if __name__ == "__main__":
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

                k += 1
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    n = int(input())
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    arr = list(map(int, input().split()))
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length

    print(triangle_number(arr))
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
    for i in range(len(nums) - 2):
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
def find_min_subarray_length(arr, k):
    n = len(arr)
    i = 0  # left pointer
    j = 0  # right pointer
    min_subarray_length = float('inf')  # initialize to a large value, will be updated later

    while j < n:
        s = 0  # sum of elements in the current subarray

        # Expand the subarray until its sum >= k
        while j < n and s < k:
            s += arr[j]
            j += 1  # Move the right pointer

        # Shrink the subarray from the left until its sum is less than k
        while i < j and s >= k:
            # Update the minimum subarray length if needed
            min_subarray_length = min(min_subarray_length, j - i)

            # Remove the leftmost element from the subarray
            s -= arr[i]
            i += 1  # Move the left pointer

    # If no subarray found, return 0, otherwise return the minimum subarray length
    return 0 if min_subarray_length == float('inf') else min_subarray_length
