package defpackage;

import android.os.Bundle;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rld {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public rld(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = i;
        this.d = iArr;
        this.c = iArr2;
        this.b = iArr3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rjq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, rjq] */
    public final uhp a(boolean z) {
        long epochMilli = Instant.now().toEpochMilli();
        uhp uhpVarA = z ? this.b.a() : this.b.b();
        szg.n(uhpVarA, new rlc(this, z, epochMilli), ugk.a);
        return uhpVarA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rjq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rjq] */
    public final uhp b(boolean z, String str, int i) {
        long epochMilli = Instant.now().toEpochMilli();
        uhp uhpVarE = z ? this.b.e(str, i) : this.b.f(str, i);
        szg.n(uhpVarE, new rlb(this, i, z, epochMilli), ugk.a);
        return uhpVarE;
    }

    public final klb c(int i) {
        kky kkyVar = (kky) this.c;
        if (kkyVar.j) {
            i |= 8;
        }
        if (kkyVar.i) {
            i |= 16;
        }
        sez sezVar = new sez();
        sezVar.s(kkyVar.a);
        sezVar.t(kkyVar.b);
        sezVar.m(kkyVar.c);
        sezVar.p(kkyVar.d);
        sezVar.o(kkyVar.e);
        sezVar.r(kkyVar.f);
        sezVar.n(this.a);
        sezVar.q(i);
        return sezVar.k();
    }

    public final String d() {
        return ((kky) this.c).f;
    }

    public final String e() {
        return ((kky) this.c).a;
    }

    public final String f() {
        return ((kky) this.c).g;
    }

    public rld(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        this.b = charSequence;
        this.d = charSequence2;
        this.c = charSequence3;
        this.a = i;
    }

    public rld(String str, int i, String str2, Set set) {
        this.a = i;
        this.d = str;
        this.c = str2;
        this.b = set;
    }

    public rld(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.c = uuid;
        this.a = i;
        this.d = bArr;
        this.b = uuidArr;
    }

    public rld(rjq rjqVar, int i, rzy rzyVar, String str) {
        this.b = rjqVar;
        this.d = rzyVar;
        this.a = i;
        this.c = str;
    }

    public rld(Bundle bundle) {
        this.d = ggz.c(bundle, "nav-entry-state:id");
        this.a = ggz.a(bundle, "nav-entry-state:destination-id");
        this.c = ggz.b(bundle, "nav-entry-state:args");
        this.b = ggz.b(bundle, "nav-entry-state:saved-state");
    }

    public rld(fwr fwrVar, int i) {
        this.d = fwrVar.d;
        this.a = i;
        this.c = fwrVar.a();
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        this.b = bundleJ;
        fwrVar.f.d.c(bundleJ);
    }

    public rld(kky kkyVar, List list, int i) {
        this.d = new ArrayList();
        this.c = kkyVar;
        this.b = list;
        this.a = i;
    }
}
