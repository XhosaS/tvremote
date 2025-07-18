package defpackage;

import android.accounts.Account;
import androidx.preference.Preference;
import com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbj extends agtu implements agvb {
    int a;
    final /* synthetic */ SearchableAppsPreferenceFragment b;
    final /* synthetic */ Account c;
    final /* synthetic */ Preference d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbj(SearchableAppsPreferenceFragment searchableAppsPreferenceFragment, Account account, Preference preference, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.b = searchableAppsPreferenceFragment;
        this.c = account;
        this.d = preference;
        this.e = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r8.b(r7) != r0) goto L29;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L11
            defpackage.agpl.b(r8)
            if (r1 == r4) goto L3e
            if (r1 == r2) goto L5c
            goto L6c
        L11:
            defpackage.agpl.b(r8)
            com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment r8 = r7.b
            fqh r8 = r8.au
            if (r8 != 0) goto L20
            java.lang.String r8 = "userAppsDataAccessor"
            defpackage.agvy.b(r8)
            r8 = r3
        L20:
            android.accounts.Account r1 = r7.c
            if (r1 == 0) goto L27
            java.lang.String r1 = r1.name
            goto L28
        L27:
            r1 = r3
        L28:
            androidx.preference.Preference r5 = r7.d
            java.lang.String r5 = r5.s
            r5.getClass()
            boolean r6 = r7.e
            r7.a = r4
            if (r1 != 0) goto L37
            java.lang.String r1 = ""
        L37:
            r4 = r4 ^ r6
            java.lang.Object r8 = r8.c(r1, r5, r4, r7)
            if (r8 == r0) goto L6f
        L3e:
            com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment r8 = r7.b
            fiu r8 = r8.al
            if (r8 != 0) goto L4a
            java.lang.String r8 = "deviceAppsDataAccessor"
            defpackage.agvy.b(r8)
            goto L4b
        L4a:
            r3 = r8
        L4b:
            androidx.preference.Preference r8 = r7.d
            java.lang.String r8 = r8.s
            r8.getClass()
            r7.a = r2
            r1 = 0
            java.lang.Object r8 = r3.q(r8, r1, r7)
            if (r8 == r0) goto L6f
        L5c:
            com.google.android.apps.tvsearch.preferences.fragment.searchable.SearchableAppsPreferenceFragment r8 = r7.b
            jbd r8 = r8.aO()
            r1 = 3
            r7.a = r1
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L6c
            goto L6f
        L6c:
            agpu r8 = defpackage.agpu.a
            return r8
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hbj(this.b, this.c, this.d, this.e, agswVar);
    }
}
