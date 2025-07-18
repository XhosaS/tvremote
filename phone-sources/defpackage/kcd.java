package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcd extends yiz implements yjz {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcd(ovq ovqVar, Context context, ExoPlayer exoPlayer, kca kcaVar, bcb bcbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = ovqVar;
        this.a = context;
        this.b = exoPlayer;
        this.c = kcaVar;
        this.d = bcbVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((kcd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((kcd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((kcd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [bdy, java.lang.Object] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.e;
            Object obj3 = this.a;
            return new kcd((ovq) obj2, (Context) obj3, (ExoPlayer) this.b, (kca) this.c, (bcb) this.d, yihVar, 0);
        }
        if (i == 1) {
            Object obj4 = this.d;
            Object obj5 = this.c;
            return new kcd((pf) obj4, (fwv) obj5, (jx) this.a, (bdy) this.b, (fyc) this.e, yihVar, 1);
        }
        Object obj6 = this.b;
        Object obj7 = this.c;
        Object obj8 = this.d;
        return new kcd((pfq) obj6, (pgb) obj7, (oyd) obj8, (by) this.a, (uyv) this.e, yihVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARN: Type inference failed for: r2v8, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcd(pf pfVar, fwv fwvVar, jx jxVar, bdy bdyVar, fyc fycVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = pfVar;
        this.c = fwvVar;
        this.a = jxVar;
        this.b = bdyVar;
        this.e = fycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcd(pfq pfqVar, pgb pgbVar, oyd oydVar, by byVar, uyv uyvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = pfqVar;
        this.c = pgbVar;
        this.d = oydVar;
        this.a = byVar;
        this.e = uyvVar;
    }
}
