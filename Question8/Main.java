package code.code8;
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
??????????????????????????????????????????????????
s;,asjdfbashkf ksaddm vsafv
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


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
??????????????????????????????????????????????????
s;,asjdfbashkf ksaddm vsafv
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

import java.util.Arrays;
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
??????????????????????????????????????????????????
s;,asjdfbashkf ksaddm vsafv
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

import java.util.Scanner;
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
??????????????????????????????????????????????????
s;,asjdfbashkf ksaddm vsafv
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


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
??????????????????????????????????????????????????
s;,asjdfbashkf ksaddm vsafv
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

public class Main {
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    ??????????????????????????????????????????????????
    s;,asjdfbashkf ksaddm vsafv
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

    public static void main(String[] args) {
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        Scanner in = new Scanner(System.in);
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        int n = in.nextInt();
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        int[] arr = new int[n];
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        for (int i = 0; i < n; i++) {
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            ??????????????????????????????????????????????????
            s;,asjdfbashkf ksaddm vsafv
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

            arr[i] = in.nextInt();
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            ??????????????????????????????????????????????????
            s;,asjdfbashkf ksaddm vsafv
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

        }
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        System.out.println(triangleNumber(arr));
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        in.close();
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        k++;
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

    }
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    ??????????????????????????????????????????????????
    s;,asjdfbashkf ksaddm vsafv
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

    public static int triangleNumber(int[] nums) {
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        int count = 0;
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        Arrays.sort(nums);
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            ??????????????????????????????????????????????????
            s;,asjdfbashkf ksaddm vsafv
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

        for (int i = 0; i < nums.length - 2; i++) {
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            ??????????????????????????????????????????????????
            s;,asjdfbashkf ksaddm vsafv
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

                while (k < nums.length && nums[i] + nums[j] > nums[k])
                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                ??????????????????????????????????????????????????
                s;,asjdfbashkf ksaddm vsafv
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

            }
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            ??????????????????????????????????????????????????
            s;,asjdfbashkf ksaddm vsafv
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

        }
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

        return count;
        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        ??????????????????????????????????????????????????
        s;,asjdfbashkf ksaddm vsafv
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

    }
    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    ??????????????????????????????????????????????????
    s;,asjdfbashkf ksaddm vsafv
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

}
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
??????????????????????????????????????????????????
s;,asjdfbashkf ksaddm vsafv
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
