package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icm implements ume {
    static final icm a = new icm();
    private static final umd b;
    private static final umd c;
    private static final umd d;
    private static final umd e;
    private static final umd f;
    private static final umd g;
    private static final umd h;
    private static final umd i;
    private static final umd j;
    private static final umd k;
    private static final umd l;
    private static final umd m;
    private static final umd n;
    private static final umd o;
    private static final umd p;

    static {
        unx unxVar = new unx("projectNumber");
        unxVar.d(new umh(1, umk.DEFAULT));
        b = unxVar.c();
        unx unxVar2 = new unx("messageId");
        unxVar2.d(new umh(2, umk.DEFAULT));
        c = unxVar2.c();
        unx unxVar3 = new unx("instanceId");
        unxVar3.d(new umh(3, umk.DEFAULT));
        d = unxVar3.c();
        unx unxVar4 = new unx("messageType");
        unxVar4.d(new umh(4, umk.DEFAULT));
        e = unxVar4.c();
        unx unxVar5 = new unx("sdkPlatform");
        unxVar5.d(new umh(5, umk.DEFAULT));
        f = unxVar5.c();
        unx unxVar6 = new unx("packageName");
        unxVar6.d(new umh(6, umk.DEFAULT));
        g = unxVar6.c();
        unx unxVar7 = new unx("collapseKey");
        unxVar7.d(new umh(7, umk.DEFAULT));
        h = unxVar7.c();
        unx unxVar8 = new unx("priority");
        unxVar8.d(new umh(8, umk.DEFAULT));
        i = unxVar8.c();
        unx unxVar9 = new unx("ttl");
        unxVar9.d(new umh(9, umk.DEFAULT));
        j = unxVar9.c();
        unx unxVar10 = new unx("topic");
        unxVar10.d(new umh(10, umk.DEFAULT));
        k = unxVar10.c();
        unx unxVar11 = new unx("bulkId");
        unxVar11.d(new umh(11, umk.DEFAULT));
        l = unxVar11.c();
        unx unxVar12 = new unx("event");
        unxVar12.d(new umh(12, umk.DEFAULT));
        m = unxVar12.c();
        unx unxVar13 = new unx("analyticsLabel");
        unxVar13.d(new umh(13, umk.DEFAULT));
        n = unxVar13.c();
        unx unxVar14 = new unx("campaignId");
        unxVar14.d(new umh(14, umk.DEFAULT));
        o = unxVar14.c();
        unx unxVar15 = new unx("composerLabel");
        unxVar15.d(new umh(15, umk.DEFAULT));
        p = unxVar15.c();
    }

    private icm() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.umb
    public final /* synthetic */ void a(Object obj, Object obj2) {
        upn upnVar = (upn) obj;
        obj2.a(b, upnVar.a);
        obj2.b(c, upnVar.b);
        obj2.b(d, upnVar.c);
        obj2.b(e, upnVar.d);
        obj2.b(f, upnVar.e);
        obj2.b(g, upnVar.f);
        obj2.b(h, upnVar.g);
        umm ummVar = (umm) obj2;
        ummVar.e(i, upnVar.h);
        ummVar.e(j, upnVar.i);
        obj2.b(k, upnVar.j);
        obj2.a(l, 0L);
        obj2.b(m, upnVar.k);
        obj2.b(n, upnVar.l);
        obj2.a(o, 0L);
        obj2.b(p, upnVar.m);
    }
}
