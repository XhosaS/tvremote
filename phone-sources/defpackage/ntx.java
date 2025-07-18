package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntx extends nxr {
    public final /* synthetic */ nty a;
    private final nsw b;
    private final ntl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntx(nty ntyVar, nsw nswVar, nwu nwuVar, ntl ntlVar) {
        super(nsz.k, nwuVar);
        this.a = ntyVar;
        this.b = nswVar;
        this.c = ntlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0294 A[Catch: all -> 0x02c6, TryCatch #5 {, blocks: (B:26:0x007b, B:28:0x007f, B:30:0x0085, B:32:0x0093, B:34:0x00b1, B:38:0x00b9, B:40:0x00c4, B:42:0x00d6, B:95:0x01bb, B:97:0x01c3, B:98:0x01c5, B:121:0x01f9, B:123:0x01fc, B:124:0x01fe, B:126:0x0206, B:170:0x02a1, B:173:0x02a9, B:174:0x02ae, B:175:0x02b2, B:186:0x02c4, B:130:0x0211, B:131:0x0215, B:151:0x025f, B:153:0x026d, B:156:0x0274, B:166:0x0294, B:169:0x029d, B:163:0x0285, B:179:0x02b9, B:43:0x00ed, B:45:0x00f5, B:73:0x0174, B:74:0x0182, B:92:0x01b2, B:46:0x0102, B:47:0x0104, B:71:0x0166, B:182:0x02bc, B:183:0x02bd, B:184:0x02bf, B:75:0x0183, B:77:0x018d, B:79:0x0191, B:80:0x0197, B:82:0x019f, B:88:0x01ae, B:132:0x0216, B:134:0x021a, B:136:0x0222, B:138:0x022d, B:137:0x0228, B:139:0x022f, B:141:0x0233, B:143:0x0237, B:145:0x023b, B:148:0x0252, B:149:0x0259, B:150:0x025e, B:99:0x01c6, B:101:0x01ca, B:103:0x01d9, B:114:0x01ee, B:115:0x01f1, B:116:0x01f4, B:117:0x01f5, B:48:0x0105, B:50:0x010d, B:51:0x0119, B:53:0x011b, B:55:0x0127, B:59:0x0137, B:61:0x013d, B:69:0x015b, B:70:0x0165, B:63:0x0147, B:64:0x014b, B:65:0x0152), top: B:306:0x007b, inners: #11, #16, #17, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x029d A[Catch: all -> 0x02c6, TryCatch #5 {, blocks: (B:26:0x007b, B:28:0x007f, B:30:0x0085, B:32:0x0093, B:34:0x00b1, B:38:0x00b9, B:40:0x00c4, B:42:0x00d6, B:95:0x01bb, B:97:0x01c3, B:98:0x01c5, B:121:0x01f9, B:123:0x01fc, B:124:0x01fe, B:126:0x0206, B:170:0x02a1, B:173:0x02a9, B:174:0x02ae, B:175:0x02b2, B:186:0x02c4, B:130:0x0211, B:131:0x0215, B:151:0x025f, B:153:0x026d, B:156:0x0274, B:166:0x0294, B:169:0x029d, B:163:0x0285, B:179:0x02b9, B:43:0x00ed, B:45:0x00f5, B:73:0x0174, B:74:0x0182, B:92:0x01b2, B:46:0x0102, B:47:0x0104, B:71:0x0166, B:182:0x02bc, B:183:0x02bd, B:184:0x02bf, B:75:0x0183, B:77:0x018d, B:79:0x0191, B:80:0x0197, B:82:0x019f, B:88:0x01ae, B:132:0x0216, B:134:0x021a, B:136:0x0222, B:138:0x022d, B:137:0x0228, B:139:0x022f, B:141:0x0233, B:143:0x0237, B:145:0x023b, B:148:0x0252, B:149:0x0259, B:150:0x025e, B:99:0x01c6, B:101:0x01ca, B:103:0x01d9, B:114:0x01ee, B:115:0x01f1, B:116:0x01f4, B:117:0x01f5, B:48:0x0105, B:50:0x010d, B:51:0x0119, B:53:0x011b, B:55:0x0127, B:59:0x0137, B:61:0x013d, B:69:0x015b, B:70:0x0165, B:63:0x0147, B:64:0x014b, B:65:0x0152), top: B:306:0x007b, inners: #11, #16, #17, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[PHI: r0
  0x00ad: PHI (r0v17 tst) = (r0v16 tst), (r0v106 tst) binds: [B:29:0x0083, B:31:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147 A[Catch: all -> 0x02ba, TRY_LEAVE, TryCatch #19 {, blocks: (B:48:0x0105, B:50:0x010d, B:51:0x0119, B:53:0x011b, B:55:0x0127, B:59:0x0137, B:61:0x013d, B:69:0x015b, B:70:0x0165, B:63:0x0147, B:64:0x014b, B:65:0x0152), top: B:324:0x0105, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v7 */
    @Override // defpackage.nxr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* synthetic */ void b(defpackage.nwf r21) {
        /*
            Method dump skipped, instructions count: 1313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntx.b(nwf):void");
    }

    @Override // defpackage.nxr, defpackage.nxs
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.q((nxc) obj);
    }

    public final void d() {
        nty ntyVar = this.a;
        nug nugVarA = nuh.c(ntyVar.w).a();
        if (nugVarA == null) {
            nty.a.set(false);
            return;
        }
        oaf oafVar = new oaf();
        oafVar.a = new nkx(this, nugVarA, 2);
        ntyVar.q(oafVar.a());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ nxc a(Status status) {
        return status;
    }
}
