package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.cuo;
import defpackage.cww;
import defpackage.cyq;
import defpackage.cyt;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends cuo {
    private final ItemDelegate mItemDelegate;
    final RecyclerView mRecyclerView;

    /* compiled from: PG */
    public class ItemDelegate extends cuo {
        private Map<View, cuo> mOriginalItemDelegates = new WeakHashMap();
        final RecyclerViewAccessibilityDelegate mRecyclerViewDelegate;

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.mRecyclerViewDelegate = recyclerViewAccessibilityDelegate;
        }

        @Override // defpackage.cuo
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            return cuoVar != null ? cuoVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // defpackage.cuo
        public cyt getAccessibilityNodeProvider(View view) {
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            return cuoVar != null ? cuoVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        public cuo getAndRemoveOriginalDelegateForItem(View view) {
            return this.mOriginalItemDelegates.remove(view);
        }

        @Override // defpackage.cuo
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            if (cuoVar != null) {
                cuoVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // defpackage.cuo
        public void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, cyqVar);
                return;
            }
            this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cyqVar);
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            if (cuoVar != null) {
                cuoVar.onInitializeAccessibilityNodeInfo(view, cyqVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, cyqVar);
            }
        }

        @Override // defpackage.cuo
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            if (cuoVar != null) {
                cuoVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // defpackage.cuo
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            cuo cuoVar = this.mOriginalItemDelegates.get(viewGroup);
            return cuoVar != null ? cuoVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.cuo
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            if (cuoVar != null) {
                if (cuoVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        public void saveOriginalDelegate(View view) {
            cuo cuoVarB = cww.b(view);
            if (cuoVarB == null || cuoVarB == this) {
                return;
            }
            this.mOriginalItemDelegates.put(view, cuoVarB);
        }

        @Override // defpackage.cuo
        public void sendAccessibilityEvent(View view, int i) {
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            if (cuoVar != null) {
                cuoVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // defpackage.cuo
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            cuo cuoVar = this.mOriginalItemDelegates.get(view);
            if (cuoVar != null) {
                cuoVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        cuo itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof ItemDelegate)) {
            this.mItemDelegate = new ItemDelegate(this);
        } else {
            this.mItemDelegate = (ItemDelegate) itemDelegate;
        }
    }

    public cuo getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // defpackage.cuo
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // defpackage.cuo
    public void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(cyqVar);
    }

    @Override // defpackage.cuo
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
