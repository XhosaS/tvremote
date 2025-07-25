package android.support.v7.util;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {
    private static final int TYPE_ADD = 1;
    private static final int TYPE_CHANGE = 3;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_REMOVE = 2;
    final ListUpdateCallback mWrapped;
    int mLastEventType = 0;
    int mLastEventPosition = -1;
    int mLastEventCount = -1;
    Object mLastEventPayload = null;

    public BatchingListUpdateCallback(ListUpdateCallback listUpdateCallback) {
        this.mWrapped = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i = this.mLastEventType;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.mWrapped.onInserted(this.mLastEventPosition, this.mLastEventCount);
        } else if (i == 2) {
            this.mWrapped.onRemoved(this.mLastEventPosition, this.mLastEventCount);
        } else if (i == 3) {
            this.mWrapped.onChanged(this.mLastEventPosition, this.mLastEventCount, this.mLastEventPayload);
        }
        this.mLastEventPayload = null;
        this.mLastEventType = 0;
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.mLastEventType == 3 && i <= (i4 = this.mLastEventCount + (i3 = this.mLastEventPosition)) && (i5 = i + i2) >= i3 && this.mLastEventPayload == obj) {
            this.mLastEventPosition = Math.min(i, i3);
            this.mLastEventCount = Math.max(i4, i5) - this.mLastEventPosition;
            return;
        }
        dispatchLastEvent();
        this.mLastEventPosition = i;
        this.mLastEventCount = i2;
        this.mLastEventPayload = obj;
        this.mLastEventType = 3;
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public void onInserted(int i, int i2) {
        int i3;
        if (this.mLastEventType == 1 && i >= (i3 = this.mLastEventPosition)) {
            int i4 = this.mLastEventCount;
            if (i <= i3 + i4) {
                this.mLastEventCount = i4 + i2;
                this.mLastEventPosition = Math.min(i, i3);
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i;
        this.mLastEventCount = i2;
        this.mLastEventType = 1;
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public void onMoved(int i, int i2) {
        dispatchLastEvent();
        this.mWrapped.onMoved(i, i2);
    }

    @Override // android.support.v7.util.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.mLastEventType == 2 && (i3 = this.mLastEventPosition) >= i && i3 <= i + i2) {
            this.mLastEventCount += i2;
            this.mLastEventPosition = i;
        } else {
            dispatchLastEvent();
            this.mLastEventPosition = i;
            this.mLastEventCount = i2;
            this.mLastEventType = 2;
        }
    }
}
