package android.support.v7.widget;

import defpackage.jn;

/* compiled from: PG */
/* loaded from: classes.dex */
interface StableIdStorage {

    /* compiled from: PG */
    public class IsolatedStableIdStorage implements StableIdStorage {
        long mNextStableId = 0;

        /* compiled from: PG */
        class WrapperStableIdLookup implements StableIdLookup {
            private final jn<Long> mLocalToGlobalLookup = new jn<>();

            public WrapperStableIdLookup() {
            }

            @Override // android.support.v7.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                Long lValueOf = (Long) this.mLocalToGlobalLookup.e(j);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(IsolatedStableIdStorage.this.obtainId());
                    this.mLocalToGlobalLookup.j(j, lValueOf);
                }
                return lValueOf.longValue();
            }
        }

        @Override // android.support.v7.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            return new WrapperStableIdLookup();
        }

        public long obtainId() {
            long j = this.mNextStableId;
            this.mNextStableId = 1 + j;
            return j;
        }
    }

    /* compiled from: PG */
    public class NoStableIdStorage implements StableIdStorage {
        private final StableIdLookup mNoIdLookup = new StableIdLookup() { // from class: android.support.v7.widget.StableIdStorage.NoStableIdStorage.1
            @Override // android.support.v7.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return -1L;
            }
        };

        @Override // android.support.v7.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            return this.mNoIdLookup;
        }
    }

    /* compiled from: PG */
    public class SharedPoolStableIdStorage implements StableIdStorage {
        private final StableIdLookup mSameIdLookup = new StableIdLookup() { // from class: android.support.v7.widget.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // android.support.v7.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                return j;
            }
        };

        @Override // android.support.v7.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            return this.mSameIdLookup;
        }
    }

    /* compiled from: PG */
    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    StableIdLookup createStableIdLookup();
}
