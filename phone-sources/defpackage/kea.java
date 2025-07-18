package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kea extends jxj {
    public jaf a;
    public pnr b;
    public pkg c;
    public pke d;
    public kdh f;
    private int g = 4;
    public yjk e = new jzm(4);

    public final pke a() {
        pke pkeVar = this.d;
        if (pkeVar != null) {
            return pkeVar;
        }
        yks.c("viewVisualElements");
        return null;
    }

    public final pkg b() {
        pkg pkgVar = this.c;
        if (pkgVar != null) {
            return pkgVar;
        }
        yks.c("visualElements");
        return null;
    }

    public final void c(cr crVar, int i, yjk yjkVar) {
        this.g = i;
        this.e = yjkVar;
        showNow(crVar, "purchase_failure_bottomsheet_tag");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    @Override // defpackage.jxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateDialogView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            r3.getClass()
            r5 = 2131625252(0x7f0e0524, float:1.8877707E38)
            android.view.View r3 = r3.inflate(r5, r4)
            kdh r4 = r2.f
            if (r4 != 0) goto L14
            java.lang.String r4 = "factory"
            defpackage.yks.c(r4)
            r4 = 0
        L14:
            java.lang.Object r4 = r4.a
            kec r4 = new kec
            r4.<init>()
            int r5 = r2.g
            r0 = -2
            r1 = 2132018626(0x7f1405c2, float:1.9675564E38)
            if (r5 == r0) goto L60
            r0 = -1
            if (r5 == r0) goto L60
            r0 = 12
            if (r5 == r0) goto L4e
            switch(r5) {
                case 2: goto L4e;
                case 3: goto L60;
                case 4: goto L3c;
                case 5: goto L60;
                case 6: goto L60;
                case 7: goto L60;
                case 8: goto L60;
                default: goto L2d;
            }
        L2d:
            android.content.Context r5 = r2.getContext()
            r5.getClass()
            java.lang.String r5 = r5.getString(r1)
            r5.getClass()
            goto L6e
        L3c:
            android.content.Context r5 = r2.getContext()
            r5.getClass()
            r0 = 2132018627(0x7f1405c3, float:1.9675566E38)
            java.lang.String r5 = r5.getString(r0)
            r5.getClass()
            goto L6e
        L4e:
            android.content.Context r5 = r2.getContext()
            r5.getClass()
            r0 = 2132018628(0x7f1405c4, float:1.9675568E38)
            java.lang.String r5 = r5.getString(r0)
            r5.getClass()
            goto L6e
        L60:
            android.content.Context r5 = r2.getContext()
            r5.getClass()
            java.lang.String r5 = r5.getString(r1)
            r5.getClass()
        L6e:
            sco r0 = new sco
            r0.<init>(r5)
            sco r5 = r4.a
            boolean r5 = defpackage.yks.e(r5, r0)
            if (r5 != 0) goto L81
            r4.a = r0
            r5 = 0
            r4.G(r5)
        L81:
            jub r5 = new jub
            r0 = 6
            r5.<init>(r2, r0)
            scc r0 = new scc
            java.lang.String r1 = "R.id.bottom_sheet_retry_button"
            r0.<init>(r1, r4, r5)
            r4.b = r0
            r5 = 1
            r4.G(r5)
            jub r5 = new jub
            r0 = 7
            r5.<init>(r2, r0)
            scc r0 = new scc
            java.lang.String r1 = "R.id.bottom_sheet_close_button"
            r0.<init>(r1, r4, r5)
            r4.c = r0
            r5 = 2
            r4.G(r5)
            r5 = 2131428046(0x7f0b02ce, float:1.8477725E38)
            android.view.View r5 = r3.findViewById(r5)
            r5.getClass()
            scb r5 = defpackage.sfy.l(r2, r5)
            r5.a(r4)
            r3.getClass()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kea.onCreateDialogView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onStop() {
        super.onStop();
        pke pkeVarA = a();
        View view = getView();
        pkeVarA.a(view != null ? view.findViewById(R.id.bottom_sheet_retry_button) : null);
    }

    @Override // defpackage.bv
    public final void onViewCreated(final View view, Bundle bundle) {
        view.getClass();
        pnr pnrVar = this.b;
        if (pnrVar == null) {
            yks.c("dialogVe");
            pnrVar = null;
        }
        pnrVar.a(this, getDialog(), new pnq() { // from class: kdz
            @Override // defpackage.pnq
            public final void a(Dialog dialog, View view2) {
                kea keaVar = this.a;
                keaVar.a().e(view2, keaVar.b().a(195597));
                keaVar.a().e(view.findViewById(R.id.bottom_sheet_retry_button), keaVar.b().a(195598));
            }

            @Override // defpackage.pnq
            public final /* synthetic */ void b(bl blVar) {
                qtl.ae(blVar);
            }
        });
    }
}
