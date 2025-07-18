package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mzl implements Parcelable {
    public final ImmutableList b;
    public final mzm c;
    public final tst d;

    public mzl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzl) {
            mzl mzlVar = (mzl) obj;
            if (this.b.equals(mzlVar.b) && this.c.equals(mzlVar.c) && this.d.equals(mzlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        tst tstVar = this.d;
        mzm mzmVar = this.c;
        return "SeasonPickerViewModel{seasons=" + this.b.toString() + ", selectedSeason=" + mzmVar.toString() + ", interactionLogger=" + tstVar.toString() + "}";
    }

    public mzl(ImmutableList immutableList, mzm mzmVar, tst tstVar) {
        if (immutableList == null) {
            throw new NullPointerException("Null seasons");
        }
        this.b = immutableList;
        if (mzmVar == null) {
            throw new NullPointerException("Null selectedSeason");
        }
        this.c = mzmVar;
        if (tstVar == null) {
            throw new NullPointerException("Null interactionLogger");
        }
        this.d = tstVar;
    }
}
