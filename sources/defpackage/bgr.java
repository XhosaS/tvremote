package defpackage;

import android.content.Context;
import android.hardware.hdmi.HdmiControlManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgr extends bgq {
    private final byj h;

    public bgr(Context context) {
        super(context);
        this.h = new byj(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    @Override // defpackage.bgp, defpackage.bgn, defpackage.bgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.bgm b(defpackage.bgl r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L50
            int r0 = r6.b
            if (r0 != 0) goto L7
            goto L50
        L7:
            bzt r1 = r5.f
            boolean r2 = r1.f()
            if (r2 == 0) goto L12
            bgm r6 = defpackage.bgm.NONE
            return r6
        L12:
            int r6 = r1.d(r6)
            r1 = 9
            r2 = 10
            r3 = 29
            r4 = 1
            if (r0 == r1) goto L24
            if (r0 == r2) goto L24
            if (r0 != r3) goto L32
            r0 = r3
        L24:
            if (r6 != r4) goto L32
            bzt r6 = r5.b
            boolean r6 = r6.c()
            if (r6 != 0) goto L31
            bgm r6 = defpackage.bgm.NONE
            return r6
        L31:
            r6 = r4
        L32:
            if (r0 == r2) goto L4d
            if (r0 != r3) goto L37
            goto L4d
        L37:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L47
            r0 = 2
            if (r6 == r0) goto L47
            r0 = 3
            if (r6 == r0) goto L4a
            r0 = 4
            if (r6 == r0) goto L4a
            bgm r6 = defpackage.bgm.NONE
            return r6
        L47:
            bgm r6 = defpackage.bgm.INCREMENTAL
            return r6
        L4a:
            bgm r6 = defpackage.bgm.VARIABLE
            return r6
        L4d:
            bgm r6 = defpackage.bgm.INCREMENTAL
            return r6
        L50:
            bgm r6 = super.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgr.b(bgl):bgm");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bgp, defpackage.bgt
    public final void d() {
        super.d();
        bzt bztVar = this.b;
        Object obj = bztVar.b;
        if (obj != null) {
            final byj byjVar = this.h;
            HdmiControlManager.CecSettingChangeListener cecSettingChangeListener = new HdmiControlManager.CecSettingChangeListener() { // from class: bgg
                public final void onChange(String str) {
                    ((bgt) byjVar.a).i();
                }
            };
            bztVar.c.put(byjVar, cecSettingChangeListener);
            ((HdmiControlManager) obj).addHdmiCecEnabledChangeListener(cecSettingChangeListener);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bgp, defpackage.bgt
    public final void e() {
        super.e();
        bzt bztVar = this.b;
        Object obj = bztVar.b;
        if (obj != null) {
            byj byjVar = this.h;
            ?? r0 = bztVar.c;
            ((HdmiControlManager) obj).removeHdmiCecEnabledChangeListener((HdmiControlManager.CecSettingChangeListener) r0.get(byjVar));
            r0.remove(byjVar);
        }
    }
}
