package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mxo implements Parcelable {
    public final ImmutableList b;
    public final mxe c;
    public final boolean d;
    public final ieg e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public mxo() {
        throw null;
    }

    public static nat a() {
        nat natVar = new nat();
        natVar.n(false);
        natVar.m(mxe.a().a());
        natVar.p(Collections.EMPTY_LIST);
        natVar.l(ieg.a);
        natVar.i(false);
        natVar.j(false);
        natVar.k(false);
        natVar.o(false);
        return natVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxo) {
            mxo mxoVar = (mxo) obj;
            if (this.b.equals(mxoVar.b) && this.c.equals(mxoVar.c) && this.d == mxoVar.d && this.e.equals(mxoVar.e) && this.f == mxoVar.f && this.g == mxoVar.g && this.h == mxoVar.h && this.i == mxoVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        ieg iegVar = this.e;
        mxe mxeVar = this.c;
        return "DistributorsViewModel{unselectedDistributors=" + this.b.toString() + ", selectedDistributor=" + mxeVar.toString() + ", shouldShowTooltip=" + this.d + ", oowMessage=" + iegVar.toString() + ", isAvod=" + this.f + ", isFreeTabEnabled=" + this.g + ", isGtvEnabled=" + this.h + ", subsDiscoveryEnabled=" + this.i + "}";
    }

    public mxo(ImmutableList immutableList, mxe mxeVar, boolean z, ieg iegVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (immutableList == null) {
            throw new NullPointerException("Null unselectedDistributors");
        }
        this.b = immutableList;
        if (mxeVar == null) {
            throw new NullPointerException("Null selectedDistributor");
        }
        this.c = mxeVar;
        this.d = z;
        if (iegVar == null) {
            throw new NullPointerException("Null oowMessage");
        }
        this.e = iegVar;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }
}
