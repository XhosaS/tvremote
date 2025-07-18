package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzk extends jxj {
    public yjk a = new gel(18);
    public yjk b = new gel(19);
    public isi c;

    @Override // defpackage.bl, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    @Override // defpackage.jxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateDialogView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r8.getClass()
            r10 = 2131624441(0x7f0e01f9, float:1.8876062E38)
            r0 = 0
            android.view.View r8 = r8.inflate(r10, r9, r0)
            android.os.Bundle r9 = r7.getArguments()
            r10 = 1
            if (r9 == 0) goto L19
            java.lang.String r1 = "dialog_bundle_share"
            boolean r9 = r9.getBoolean(r1)
            goto L1a
        L19:
            r9 = r10
        L1a:
            r1 = 2131427592(0x7f0b0108, float:1.8476805E38)
            android.view.View r1 = r8.findViewById(r1)
            r1.getClass()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2132018756(0x7f140644, float:1.9675828E38)
            java.lang.String r3 = "dialog_bundle_title"
            r4 = 0
            if (r9 == 0) goto L49
            android.content.Context r9 = r7.getContext()
            if (r9 == 0) goto L67
            android.os.Bundle r5 = r7.getArguments()
            if (r5 == 0) goto L3f
            java.lang.String r5 = r5.getString(r3)
            goto L40
        L3f:
            r5 = r4
        L40:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r0] = r5
            java.lang.String r9 = r9.getString(r2, r6)
            goto L68
        L49:
            android.content.Context r9 = r7.getContext()
            if (r9 == 0) goto L67
            android.os.Bundle r5 = r7.getArguments()
            if (r5 == 0) goto L5a
            java.lang.String r5 = r5.getString(r3)
            goto L5b
        L5a:
            r5 = r4
        L5b:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r0] = r5
            r5 = 2132018888(0x7f1406c8, float:1.9676095E38)
            java.lang.String r9 = r9.getString(r5, r6)
            goto L68
        L67:
            r9 = r4
        L68:
            r1.setText(r9)
            android.content.Context r9 = r7.getContext()
            if (r9 == 0) goto L82
            android.os.Bundle r1 = r7.getArguments()
            if (r1 == 0) goto L7b
            java.lang.String r4 = r1.getString(r3)
        L7b:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r4
            r9.getString(r2, r10)
        L82:
            r9 = 2131428724(0x7f0b0574, float:1.84791E38)
            android.view.View r9 = r8.findViewById(r9)
            r9.getClass()
            android.widget.Button r9 = (android.widget.Button) r9
            r10 = 2131427610(0x7f0b011a, float:1.8476841E38)
            android.view.View r10 = r8.findViewById(r10)
            r10.getClass()
            android.widget.Button r10 = (android.widget.Button) r10
            r0 = 2131427663(0x7f0b014f, float:1.8476949E38)
            android.view.View r0 = r8.findViewById(r0)
            r0.getClass()
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            iuy r1 = new iuy
            r2 = 3
            r1.<init>(r7, r0, r2)
            r9.setOnClickListener(r1)
            jyr r9 = new jyr
            r0 = 4
            r9.<init>(r7, r0)
            r10.setOnClickListener(r9)
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzk.onCreateDialogView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
