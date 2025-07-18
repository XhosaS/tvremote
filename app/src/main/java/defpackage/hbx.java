package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbx extends agtu implements agvb {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ List c;
    final /* synthetic */ hby d;
    final /* synthetic */ String e;
    final /* synthetic */ Duration f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbx(boolean z, List list, hby hbyVar, String str, Duration duration, boolean z2, boolean z3, String str2, agsw agswVar) {
        super(2, agswVar);
        this.b = z;
        this.c = list;
        this.d = hbyVar;
        this.e = str;
        this.f = duration;
        this.g = z2;
        this.h = z3;
        this.i = str2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (defpackage.ahal.a(r14.g, r1, r13) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a A[EDGE_INSN: B:109:0x017a->B:69:0x017a BREAK  A[LOOP:0: B:31:0x00c6->B:68:0x016a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hbx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, agswVar);
    }
}
