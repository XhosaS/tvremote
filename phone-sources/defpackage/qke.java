package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qke extends yiz implements yjz {
    long a;
    int b;
    final /* synthetic */ qkh c;
    final /* synthetic */ List d;
    final /* synthetic */ Map e;
    final /* synthetic */ qjz f;
    final /* synthetic */ qel g;
    final /* synthetic */ vmd h;
    final /* synthetic */ int i;
    final /* synthetic */ qjx j;
    final /* synthetic */ String k;
    final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qke(qkh qkhVar, List list, Map map, qjz qjzVar, qel qelVar, vmd vmdVar, int i, qjx qjxVar, String str, String str2, yih yihVar) {
        super(2, yihVar);
        this.c = qkhVar;
        this.d = list;
        this.e = map;
        this.f = qjzVar;
        this.g = qelVar;
        this.h = vmdVar;
        this.i = i;
        this.j = qjxVar;
        this.k = str;
        this.l = str2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qke) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new qke(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, xbw] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            yio r0 = defpackage.yio.a
            int r1 = r13.b
            r2 = 1
            if (r1 == 0) goto Le
            long r0 = r13.a
            defpackage.ybn.f(r14)
            r11 = r13
            goto L31
        Le:
            defpackage.ybn.f(r14)
            qkh r3 = r13.c
            j$.time.Instant r14 = j$.time.Instant.now()
            long r8 = r14.toEpochMilli()
            java.util.List r4 = r13.d
            java.util.Map r5 = r13.e
            qjz r6 = r13.f
            qel r7 = r13.g
            vmd r10 = r13.h
            r13.a = r8
            r13.b = r2
            r11 = r13
            java.lang.Object r14 = r3.c(r4, r5, r6, r7, r8, r10, r11)
            if (r14 == r0) goto Ld1
            r0 = r8
        L31:
            qdl r14 = (defpackage.qdl) r14
            boolean r3 = r14 instanceof defpackage.qdn
            if (r3 == 0) goto Ld0
            r3 = r14
            qdn r3 = (defpackage.qdn) r3
            java.lang.Object r3 = r3.a
            java.util.Map r3 = (java.util.Map) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L45
            goto L66
        L45:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L4d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            qdl r4 = (defpackage.qdl) r4
            boolean r4 = r4.i()
            if (r4 != 0) goto L4d
            goto Ld0
        L66:
            qkh r3 = r11.c
            qel r4 = r11.g
            int r5 = r11.i
            qjx r6 = r11.j
            java.lang.String r7 = r11.k
            java.lang.String r8 = r11.l
            yfo r9 = r3.b
            cb r3 = r3.e(r4)
            java.lang.Object r9 = r9.b()
            boolean r10 = r4.a()
            r12 = 0
            if (r10 == 0) goto L8a
            boolean r4 = r4.b()
            if (r4 == 0) goto L8a
            goto L8b
        L8a:
            r2 = r12
        L8b:
            r6.getClass()
            java.lang.Object r3 = r3.a
            java.lang.Object r3 = r3.b()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = "last_successful_registration_request_hash_code"
            android.content.SharedPreferences$Editor r3 = r3.putInt(r4, r5)
            java.lang.String r4 = "last_successful_registration_environment_url"
            java.lang.String r9 = (java.lang.String) r9
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r9)
            java.lang.String r4 = "last_successful_registration_time_ms"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r4, r0)
            java.lang.String r1 = "is_registered_to_unified_fcm_registration"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            qjx r1 = defpackage.qjx.a
            if (r6 == r1) goto Lbf
            int r1 = r6.f
            java.lang.String r2 = "last_successful_registration_account_type"
            r0.putInt(r2, r1)
        Lbf:
            if (r7 == 0) goto Lc6
            java.lang.String r1 = "last_successful_registration_pseudonymous_cookie"
            r0.putString(r1, r7)
        Lc6:
            if (r8 == 0) goto Lcd
            java.lang.String r1 = "last_successful_fcm_registration_token"
            r0.putString(r1, r8)
        Lcd:
            r0.apply()
        Ld0:
            return r14
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qke.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
