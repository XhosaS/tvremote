package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import defpackage.cuj;
import defpackage.cuk;
import defpackage.jn;
import defpackage.jo;
import defpackage.ko;

/* compiled from: PG */
/* loaded from: classes.dex */
class ViewInfoStore {
    private static final boolean DEBUG = false;
    final ko<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap = new ko<>();
    final jn<RecyclerView.ViewHolder> mOldChangedHolders = new jn<>();

    /* compiled from: PG */
    class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static cuj<InfoRecord> sPool = new cuk(20);
        int flags;
        RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        static void drainCache() {
            while (sPool.a() != null) {
            }
        }

        static InfoRecord obtain() {
            InfoRecord infoRecord = (InfoRecord) sPool.a();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }

        static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.b(infoRecord);
        }
    }

    /* compiled from: PG */
    interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i) {
        InfoRecord infoRecord;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int iC = this.mLayoutHolderMap.c(viewHolder);
        if (iC >= 0 && (infoRecord = (InfoRecord) this.mLayoutHolderMap.g(iC)) != null) {
            int i2 = infoRecord.flags;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                infoRecord.flags = i3;
                if (i == 4) {
                    itemHolderInfo = infoRecord.preInfo;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = infoRecord.postInfo;
                }
                if ((i3 & 12) == 0) {
                    this.mLayoutHolderMap.e(iC);
                    InfoRecord.recycle(infoRecord);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            ko<RecyclerView.ViewHolder, InfoRecord> koVar = this.mLayoutHolderMap;
            InfoRecord infoRecordObtain = InfoRecord.obtain();
            koVar.put(viewHolder, infoRecordObtain);
            infoRecord = infoRecordObtain;
        }
        infoRecord.flags |= 2;
        infoRecord.preInfo = itemHolderInfo;
    }

    public void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            ko<RecyclerView.ViewHolder, InfoRecord> koVar = this.mLayoutHolderMap;
            InfoRecord infoRecordObtain = InfoRecord.obtain();
            koVar.put(viewHolder, infoRecordObtain);
            infoRecord = infoRecordObtain;
        }
        infoRecord.flags |= 1;
    }

    public void addToOldChangeHolders(long j, RecyclerView.ViewHolder viewHolder) {
        this.mOldChangedHolders.j(j, viewHolder);
    }

    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            ko<RecyclerView.ViewHolder, InfoRecord> koVar = this.mLayoutHolderMap;
            InfoRecord infoRecordObtain = InfoRecord.obtain();
            koVar.put(viewHolder, infoRecordObtain);
            infoRecord = infoRecordObtain;
        }
        infoRecord.postInfo = itemHolderInfo;
        infoRecord.flags |= 8;
    }

    public void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            ko<RecyclerView.ViewHolder, InfoRecord> koVar = this.mLayoutHolderMap;
            InfoRecord infoRecordObtain = InfoRecord.obtain();
            koVar.put(viewHolder, infoRecordObtain);
            infoRecord = infoRecordObtain;
        }
        infoRecord.preInfo = itemHolderInfo;
        infoRecord.flags |= 4;
    }

    public void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.i();
    }

    public RecyclerView.ViewHolder getFromOldChangeHolders(long j) {
        return (RecyclerView.ViewHolder) this.mOldChangedHolders.e(j);
    }

    public boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null || (infoRecord.flags & 1) == 0) {
            return DEBUG;
        }
        return true;
    }

    public boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null || (infoRecord.flags & 4) == 0) {
            return DEBUG;
        }
        return true;
    }

    public void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    public void process(ProcessCallback processCallback) {
        int i = this.mLayoutHolderMap.d;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.mLayoutHolderMap.d(i);
            InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.e(i);
            int i2 = infoRecord.flags;
            if ((i2 & 3) == 3) {
                processCallback.unused(viewHolder);
            } else if ((i2 & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = infoRecord.preInfo;
                if (itemHolderInfo == null) {
                    processCallback.unused(viewHolder);
                } else {
                    processCallback.processDisappeared(viewHolder, itemHolderInfo, infoRecord.postInfo);
                }
            } else if ((i2 & 14) == 14) {
                processCallback.processAppeared(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
            } else if ((i2 & 12) == 12) {
                processCallback.processPersistent(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
            } else if ((i2 & 4) != 0) {
                processCallback.processDisappeared(viewHolder, infoRecord.preInfo, null);
            } else if ((i2 & 8) != 0) {
                processCallback.processAppeared(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
            }
            InfoRecord.recycle(infoRecord);
        }
    }

    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.flags &= -2;
    }

    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        int iB = this.mOldChangedHolders.b();
        while (true) {
            iB--;
            if (iB < 0) {
                break;
            }
            if (viewHolder == this.mOldChangedHolders.g(iB)) {
                jn<RecyclerView.ViewHolder> jnVar = this.mOldChangedHolders;
                Object[] objArr = jnVar.c;
                Object obj = objArr[iB];
                Object obj2 = jo.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    jnVar.a = true;
                }
            }
        }
        InfoRecord infoRecordRemove = this.mLayoutHolderMap.remove(viewHolder);
        if (infoRecordRemove != null) {
            InfoRecord.recycle(infoRecordRemove);
        }
    }
}
