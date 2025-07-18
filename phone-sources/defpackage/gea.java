package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gea implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gea(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, sui] */
    /* JADX WARN: Type inference failed for: r7v3, types: [idr, java.lang.Object] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCheckedChanged(android.widget.CompoundButton r6, boolean r7) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            int r0 = r5.b
            switch(r0) {
                case 0: goto L98;
                case 1: goto L86;
                case 2: goto L74;
                case 3: goto L6c;
                case 4: goto L64;
                case 5: goto L5c;
                case 6: goto L54;
                case 7: goto L4c;
                case 8: goto L3b;
                case 9: goto L1c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.a
            r1 = r0
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            zft r2 = r1.i
            if (r2 == 0) goto Lbd
            if (r7 == 0) goto Laa
            java.lang.Object r3 = r2.a
            stx r3 = (defpackage.stx) r3
            boolean r0 = r3.e(r0)
            if (r0 == 0) goto Lbd
            goto Lb6
        L1c:
            java.lang.Object r0 = r5.a
            com.google.android.apps.play.movies.mobileux.screen.details.familylibrary.FamilyLibraryView r0 = (com.google.android.apps.play.movies.mobileux.screen.details.familylibrary.FamilyLibraryView) r0
            android.support.v7.widget.SwitchCompat r1 = r0.a
            r2 = 0
            r1.setOnCheckedChangeListener(r2)
            r1 = r7 ^ 1
            android.support.v7.widget.SwitchCompat r2 = r0.a
            r2.setChecked(r1)
            android.support.v7.widget.SwitchCompat r0 = r0.a
            r0.setOnCheckedChangeListener(r5)
            myh r0 = new myh
            r0.<init>(r7)
            defpackage.kff.s(r6, r0)
            return
        L3b:
            r6.getClass()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r7 = r5.a
            kdj r7 = (defpackage.kdj) r7
            java.lang.Object r7 = r7.c
            r7.c(r6)
            return
        L4c:
            java.lang.Object r0 = r5.a
            com.google.android.apps.googletv.app.internal.MaterialSelectionActivity r0 = (com.google.android.apps.googletv.app.internal.MaterialSelectionActivity) r0
            com.google.android.apps.googletv.app.internal.MaterialSelectionActivity.m108$r8$lambda$0KVWvheURmIdwQv76FrfPguRI0(r0, r6, r7)
            return
        L54:
            java.lang.Object r0 = r5.a
            com.google.android.apps.googletv.app.internal.MaterialSelectionActivity r0 = (com.google.android.apps.googletv.app.internal.MaterialSelectionActivity) r0
            com.google.android.apps.googletv.app.internal.MaterialSelectionActivity.$r8$lambda$HSFQa_RrV_AIyYv_fFSBX4XpdrM(r0, r6, r7)
            return
        L5c:
            java.lang.Object r0 = r5.a
            com.google.android.apps.googletv.app.internal.MaterialSelectionActivity r0 = (com.google.android.apps.googletv.app.internal.MaterialSelectionActivity) r0
            com.google.android.apps.googletv.app.internal.MaterialSelectionActivity.m109$r8$lambda$LenvE20Hh4oei5dxiKsFomqqYE(r0, r6, r7)
            return
        L64:
            java.lang.Object r0 = r5.a
            com.google.android.apps.googletv.app.internal.MaterialChipActivity r0 = (com.google.android.apps.googletv.app.internal.MaterialChipActivity) r0
            com.google.android.apps.googletv.app.internal.MaterialChipActivity.m98$r8$lambda$67tx00dtRvsw0DkV4SGsRBeWB0(r0, r6, r7)
            return
        L6c:
            java.lang.Object r0 = r5.a
            com.google.android.apps.googletv.app.internal.MaterialChipActivity r0 = (com.google.android.apps.googletv.app.internal.MaterialChipActivity) r0
            com.google.android.apps.googletv.app.internal.MaterialChipActivity.$r8$lambda$QPJdfMYVJqrGHq_cd2Xtl2o5jyM(r0, r6, r7)
            return
        L74:
            java.lang.Object r6 = r5.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1 = r6
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            r1.Q(r0)
            androidx.preference.TwoStatePreference r6 = (androidx.preference.TwoStatePreference) r6
            r6.k(r7)
            return
        L86:
            java.lang.Object r6 = r5.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1 = r6
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            r1.Q(r0)
            androidx.preference.TwoStatePreference r6 = (androidx.preference.TwoStatePreference) r6
            r6.k(r7)
            return
        L98:
            java.lang.Object r6 = r5.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1 = r6
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            r1.Q(r0)
            androidx.preference.TwoStatePreference r6 = (androidx.preference.TwoStatePreference) r6
            r6.k(r7)
            return
        Laa:
            java.lang.Object r3 = r2.a
            stx r3 = (defpackage.stx) r3
            boolean r4 = r3.d
            boolean r0 = r3.f(r0, r4)
            if (r0 == 0) goto Lbd
        Lb6:
            java.lang.Object r0 = r2.a
            stx r0 = (defpackage.stx) r0
            r0.d()
        Lbd:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r1.g
            if (r0 == 0) goto Lc4
            r0.onCheckedChanged(r6, r7)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gea.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    public /* synthetic */ gea(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
