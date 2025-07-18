package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ktz implements Parcelable {
    public static final ktz a = i(ImmutableList.of());
    public final ImmutableList b;
    public final ieg c;
    public final ieg d;
    public final ieg e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;

    public ktz() {
        throw null;
    }

    public static ktz d(kvo... kvoVarArr) {
        return i(ImmutableList.copyOf(kvoVarArr));
    }

    private static ieg h(ieg iegVar, ieg iegVar2) {
        kvn kvnVar;
        kvn kvnVar2;
        kvn kvnVar3;
        if (iegVar.m()) {
            if (iegVar2.m()) {
                kvo kvoVar = (kvo) iegVar.g();
                kvo kvoVar2 = (kvo) iegVar2.g();
                long j = kvoVar.f;
                long j2 = kvoVar2.f;
                if (j != j2 ? j > j2 : (kvnVar = kvoVar.i) == (kvnVar2 = kvoVar2.i) ? !kvoVar.e() : (kvnVar != (kvnVar3 = kvn.QUALITY_UHD1) || kvnVar2 == kvnVar3) && (kvnVar != kvn.QUALITY_HD || kvnVar2 != kvn.QUALITY_SD)) {
                }
            }
            return iegVar;
        }
        return iegVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ktz i(ImmutableList immutableList) {
        ieg iegVar = ieg.a;
        UnmodifiableIterator it = immutableList.iterator();
        ieg iegVarH = iegVar;
        ieg iegVarH2 = iegVarH;
        ieg iegVarH3 = iegVarH2;
        boolean zF = false;
        boolean zC = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            kvo kvoVar = (kvo) it.next();
            ieg iegVarF = ieg.f(kvoVar);
            zF |= kvoVar.f();
            zC |= kvoVar.c();
            if (kvoVar.l) {
                i3++;
                iegVarH3 = h(iegVarH3, iegVarF);
            } else {
                kvm kvmVar = kvoVar.h;
                if (kvmVar == kvm.TYPE_PURCHASE) {
                    i++;
                    iegVarH2 = h(iegVarH2, iegVarF);
                }
                if (kvmVar == kvm.TYPE_RENTAL) {
                    i2++;
                    iegVarH = h(iegVarH, iegVarF);
                }
            }
        }
        if (immutableList == null) {
            throw new NullPointerException("Null offers");
        }
        if (iegVarH == null) {
            throw new NullPointerException("Null cheapestRentalOffer");
        }
        if (iegVarH2 == null) {
            throw new NullPointerException("Null cheapestBuyOffer");
        }
        if (iegVarH3 != null) {
            return new ktk(immutableList, iegVarH, iegVarH2, iegVarH3, zF, zC, i, i2, i3);
        }
        throw new NullPointerException("Null cheapestPreorderOffer");
    }

    public final int a() {
        return this.b.size();
    }

    public final ieg b() {
        return h(h(this.c, this.d), this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ieg c(kvp kvpVar) {
        if (kvpVar.equals(kvp.a)) {
            return b();
        }
        ImmutableList immutableList = this.b;
        ieg iegVarH = ieg.a;
        UnmodifiableIterator it = immutableList.iterator();
        ieg iegVarH2 = iegVarH;
        while (it.hasNext()) {
            kvo kvoVar = (kvo) it.next();
            kvm kvmVar = kvpVar.b;
            if (kvmVar == kvm.TYPE_UNSPECIFIED || kvmVar == kvoVar.h) {
                iegVarH2 = h(ieg.f(kvoVar), iegVarH2);
                kvn kvnVar = kvpVar.c;
                if (kvnVar == kvn.QUALITY_UNSPECIFIED || kvnVar == kvoVar.i) {
                    iegVarH = h(ieg.f(kvoVar), iegVarH);
                }
            }
        }
        return iegVarH.m() ? iegVarH : iegVarH2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(kvm kvmVar) {
        UnmodifiableIterator it = this.b.iterator();
        while (it.hasNext()) {
            kvo kvoVar = (kvo) it.next();
            if (kvoVar.b() && kvoVar.h == kvmVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktz) {
            ktz ktzVar = (ktz) obj;
            if (this.b.equals(ktzVar.b) && this.c.equals(ktzVar.c) && this.d.equals(ktzVar.d) && this.e.equals(ktzVar.e) && this.f == ktzVar.f && this.g == ktzVar.g && this.h == ktzVar.h && this.i == ktzVar.i && this.j == ktzVar.j) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.h == 1;
    }

    public final boolean g() {
        return this.i == 1;
    }

    public final int hashCode() {
        return ((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j;
    }

    public final String toString() {
        ieg iegVar = this.e;
        ieg iegVar2 = this.d;
        ieg iegVar3 = this.c;
        return "AvailableOffers{offers=" + this.b.toString() + ", cheapestRentalOffer=" + iegVar3.toString() + ", cheapestBuyOffer=" + iegVar2.toString() + ", cheapestPreorderOffer=" + iegVar.toString() + ", haveUhdOffer=" + this.f + ", haveAvodOffer=" + this.g + ", buyOfferCount=" + this.h + ", rentalOfferCount=" + this.i + ", preorderOfferCount=" + this.j + "}";
    }

    public ktz(ImmutableList immutableList, ieg iegVar, ieg iegVar2, ieg iegVar3, boolean z, boolean z2, int i, int i2, int i3) {
        if (immutableList == null) {
            throw new NullPointerException("Null offers");
        }
        this.b = immutableList;
        if (iegVar == null) {
            throw new NullPointerException("Null cheapestRentalOffer");
        }
        this.c = iegVar;
        if (iegVar2 == null) {
            throw new NullPointerException("Null cheapestBuyOffer");
        }
        this.d = iegVar2;
        if (iegVar3 == null) {
            throw new NullPointerException("Null cheapestPreorderOffer");
        }
        this.e = iegVar3;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }
}
