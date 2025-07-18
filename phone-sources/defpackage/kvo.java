package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kvo implements Parcelable {
    public final String a;
    public final ieg b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final String g;
    public final kvm h;
    public final kvn i;
    public final String j;
    public final String k;
    public final boolean l;
    public final int m;
    public final ieg n;

    public kvo() {
        throw null;
    }

    public static kvl a() {
        kvl kvlVar = new kvl();
        kvlVar.j(kvn.QUALITY_UNSPECIFIED);
        kvlVar.l(0);
        kvlVar.n(0);
        kvlVar.k(0L);
        ieg iegVar = ieg.a;
        kvlVar.m(iegVar);
        kvlVar.f(false);
        kvlVar.b(0);
        kvlVar.o(iegVar);
        return kvlVar;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.k);
    }

    public final boolean c() {
        return this.h == kvm.TYPE_FREE_WITH_ADS;
    }

    public final boolean d() {
        return this.f == 0;
    }

    public final boolean e() {
        return this.h == kvm.TYPE_PURCHASE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvo) {
            kvo kvoVar = (kvo) obj;
            if (this.a.equals(kvoVar.a) && this.b.equals(kvoVar.b) && this.c == kvoVar.c && this.d == kvoVar.d && this.e == kvoVar.e && this.f == kvoVar.f && this.g.equals(kvoVar.g) && this.h.equals(kvoVar.h) && this.i.equals(kvoVar.i) && this.j.equals(kvoVar.j) && this.k.equals(kvoVar.k) && this.l == kvoVar.l && this.m == kvoVar.m && this.n.equals(kvoVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.i == kvn.QUALITY_UHD1;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.f;
        String str = this.g;
        long j2 = this.e;
        return (((((((((((((((((((((((iHashCode * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ str.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.n;
        kvn kvnVar = this.i;
        kvm kvmVar = this.h;
        return "Offer{offerId=" + this.a + ", rentalPolicy=" + this.b.toString() + ", rentalLongTimerSec=" + this.c + ", rentalShortTimerSec=" + this.d + ", rentalExpirationTimestampSec=" + this.e + ", priceMicros=" + this.f + ", currencyCode=" + this.g + ", offerType=" + kvmVar.toString() + ", quality=" + kvnVar.toString() + ", formattedAmount=" + this.j + ", formattedFullAmount=" + this.k + ", isPreorder=" + this.l + ", ageGate=" + this.m + ", subscriptionDetails=" + iegVar.toString() + "}";
    }

    public kvo(String str, ieg iegVar, int i, int i2, long j, long j2, String str2, kvm kvmVar, kvn kvnVar, String str3, String str4, boolean z, int i3, ieg iegVar2) {
        if (str == null) {
            throw new NullPointerException("Null offerId");
        }
        this.a = str;
        if (iegVar == null) {
            throw new NullPointerException("Null rentalPolicy");
        }
        this.b = iegVar;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        if (str2 == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.g = str2;
        if (kvmVar == null) {
            throw new NullPointerException("Null offerType");
        }
        this.h = kvmVar;
        if (kvnVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.i = kvnVar;
        if (str3 == null) {
            throw new NullPointerException("Null formattedAmount");
        }
        this.j = str3;
        if (str4 == null) {
            throw new NullPointerException("Null formattedFullAmount");
        }
        this.k = str4;
        this.l = z;
        this.m = i3;
        if (iegVar2 == null) {
            throw new NullPointerException("Null subscriptionDetails");
        }
        this.n = iegVar2;
    }
}
