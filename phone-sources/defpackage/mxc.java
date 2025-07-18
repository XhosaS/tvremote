package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxc {
    public final ImmutableList a;
    public final int b;

    public mxc() {
        throw null;
    }

    public static rub a() {
        rub rubVar = new rub((char[]) null);
        rubVar.g(ImmutableList.of());
        rubVar.h(0);
        return rubVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxc) {
            mxc mxcVar = (mxc) obj;
            if (this.a.equals(mxcVar.a) && this.b == mxcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "DistributorItemListResult{list=" + String.valueOf(this.a) + ", state=" + this.b + "}";
    }

    public mxc(ImmutableList immutableList, int i) {
        this.a = immutableList;
        this.b = i;
    }
}
