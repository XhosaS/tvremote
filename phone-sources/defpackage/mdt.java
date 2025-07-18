package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdt extends yiz implements yjz {
    int a;
    final /* synthetic */ mdw b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ ylb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdt(mdw mdwVar, String str, int i, boolean z, String str2, ylb ylbVar, yih yihVar) {
        super(2, yihVar);
        this.b = mdwVar;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = str2;
        this.g = ylbVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mdt) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new mdt(this.b, this.c, this.d, this.e, this.f, this.g, yihVar);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        try {
            if (this.a != 0) {
                ybn.f(obj);
            } else {
                ybn.f(obj);
                mdw mdwVar = this.b;
                yqe yqeVarQ = ykr.q(mdwVar.b, new yov("sendChannel-update"), 0, new mds(this.f, this.c, this.d, this.e, mdwVar, this.g, null), 2);
                this.a = 1;
                if (yqeVarQ.p(this) == yioVar) {
                    return yioVar;
                }
            }
        } catch (CancellationException e) {
            krd.d("Error sending watchlist update task (assetId: " + this.c + " , assetType: " + this.d + " , isAdd: " + this.e + ").", e);
        }
        return ygi.a;
    }
}
