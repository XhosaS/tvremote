package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jon extends sbx {
    private static final tui b = tui.l("com/google/android/apps/googletv/app/presentation/components/genericstreampage/GenericStreamPagePresenter");
    public final jaf a;
    private final iyh c;
    private final mjb d;
    private final kmo e;
    private final xhg f;
    private final gag g;
    private final dhq h;

    public jon(dhq dhqVar, iyh iyhVar, mjb mjbVar, jaf jafVar, gag gagVar, kmo kmoVar, xhg xhgVar) {
        mjbVar.getClass();
        jafVar.getClass();
        gagVar.getClass();
        kmoVar.getClass();
        this.h = dhqVar;
        this.c = iyhVar;
        this.d = mjbVar;
        this.a = jafVar;
        this.g = gagVar;
        this.e = kmoVar;
        this.f = xhgVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jok jokVar = (jok) obj;
        int i = ((wso) jokVar.b).c;
        int i2 = 9;
        jor jorVar = new jor(i == 3 ? R.layout.generic_stream_page_layout : i == 9 ? R.layout.generic_stream_page_highlight_layout : i == 8 ? R.layout.generic_stream_page_people_row_layout : R.layout.generic_stream_page_grid_layout);
        jorVar.a = new jmm(this, jokVar, i2);
        jorVar.b = new jnq(this, jokVar, 5);
        return jorVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Type inference failed for: r3v1, types: [ids, java.lang.Object] */
    @Override // defpackage.sbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void c(java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jon.c(java.lang.Object, java.lang.Object):void");
    }
}
