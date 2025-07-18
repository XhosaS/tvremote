package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwq implements lhf {
    public final View a;
    public final mwv b;

    public mwq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwq) {
            mwq mwqVar = (mwq) obj;
            if (this.a.equals(mwqVar.a) && this.b.equals(mwqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        mwv mwvVar = this.b;
        return "ActionClickEvent{view=" + this.a.toString() + ", actionViewModel=" + mwvVar.toString() + "}";
    }

    public mwq(View view, mwv mwvVar) {
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.a = view;
        if (mwvVar == null) {
            throw new NullPointerException("Null actionViewModel");
        }
        this.b = mwvVar;
    }
}
