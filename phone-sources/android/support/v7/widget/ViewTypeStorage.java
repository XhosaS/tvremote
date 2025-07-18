package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import defpackage.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
interface ViewTypeStorage {

    /* compiled from: PG */
    public class IsolatedViewTypeStorage implements ViewTypeStorage {
        SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper = new SparseArray<>();
        int mNextViewType = 0;

        /* compiled from: PG */
        class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;
            private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
            private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // android.support.v7.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IsolatedViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            @Override // android.support.v7.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                int iIndexOfKey = this.mGlobalToLocalMapping.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    return this.mGlobalToLocalMapping.valueAt(iIndexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.mWrapper.adapter);
            }

            @Override // android.support.v7.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                int iIndexOfKey = this.mLocalToGlobalMapping.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    return this.mLocalToGlobalMapping.valueAt(iIndexOfKey);
                }
                int iObtainViewType = IsolatedViewTypeStorage.this.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i, iObtainViewType);
                this.mGlobalToLocalMapping.put(iObtainViewType, i);
                return iObtainViewType;
            }
        }

        @Override // android.support.v7.widget.ViewTypeStorage
        public ViewTypeLookup createViewTypeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // android.support.v7.widget.ViewTypeStorage
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            NestedAdapterWrapper nestedAdapterWrapper = this.mGlobalTypeToWrapper.get(i);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException(a.cf(i, "Cannot find the wrapper for global view type "));
        }

        public int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
            int i = this.mNextViewType;
            this.mNextViewType = i + 1;
            this.mGlobalTypeToWrapper.put(i, nestedAdapterWrapper);
            return i;
        }

        public void removeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            int size = this.mGlobalTypeToWrapper.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                if (this.mGlobalTypeToWrapper.valueAt(size) == nestedAdapterWrapper) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    /* compiled from: PG */
    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    ViewTypeLookup createViewTypeWrapper(NestedAdapterWrapper nestedAdapterWrapper);

    NestedAdapterWrapper getWrapperForGlobalType(int i);

    /* compiled from: PG */
    public class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper = new SparseArray<>();

        @Override // android.support.v7.widget.ViewTypeStorage
        public ViewTypeLookup createViewTypeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // android.support.v7.widget.ViewTypeStorage
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            List<NestedAdapterWrapper> list = this.mGlobalTypeToWrapper.get(i);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(a.cf(i, "Cannot find the wrapper for global view type "));
            }
            return list.get(0);
        }

        public void removeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            int size = this.mGlobalTypeToWrapper.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                List<NestedAdapterWrapper> listValueAt = this.mGlobalTypeToWrapper.valueAt(size);
                if (listValueAt.remove(nestedAdapterWrapper) && listValueAt.isEmpty()) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }

        /* compiled from: PG */
        class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // android.support.v7.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                SharedIdRangeViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            @Override // android.support.v7.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                List<NestedAdapterWrapper> arrayList = SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.get(i);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.put(i, arrayList);
                }
                if (!arrayList.contains(this.mWrapper)) {
                    arrayList.add(this.mWrapper);
                }
                return i;
            }

            @Override // android.support.v7.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                return i;
            }
        }
    }
}
