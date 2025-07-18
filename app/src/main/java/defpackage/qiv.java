package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qiv implements qir {
    private final kqf a;
    private final CallerInfo b = new CallerInfo("profile-".concat("OneGoogle"), 1);

    public qiv(Context context, kqf kqfVar, Account account, yrp yrpVar, yrp yrpVar2) {
        this.a = kqfVar;
        qit qitVar = new qit(yrpVar2, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(qitVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(qitVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        qiu qiuVar = new qiu(yrpVar, account);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(qiuVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(qiuVar, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    @Override // defpackage.qir
    public final zyd a() {
        SyncOptions syncOptions = new SyncOptions();
        zyd zydVarA = otn.a(this.a.a(new byte[0], syncOptions, this.b));
        zvi zviVar = new zvi() { // from class: qis
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
            
                if (r2 != false) goto L17;
             */
            @Override // defpackage.zvi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a(java.lang.Object r5) throws defpackage.abxv {
                /*
                    r4 = this;
                    byte[] r5 = (byte[]) r5
                    com.google.protobuf.ExtensionRegistryLite r0 = com.google.protobuf.ExtensionRegistryLite.a
                    abza r0 = defpackage.abza.a
                    com.google.protobuf.ExtensionRegistryLite r0 = com.google.protobuf.ExtensionRegistryLite.a
                    abla r1 = defpackage.abla.a
                    r2 = 0
                    int r3 = r5.length
                    abxd r5 = defpackage.abxd.h(r1, r5, r2, r3, r0)
                    if (r5 == 0) goto L46
                    r0 = 1
                    r1 = 0
                    java.lang.Object r2 = r5.cM(r0, r1)
                    java.lang.Byte r2 = (java.lang.Byte) r2
                    byte r2 = r2.byteValue()
                    if (r2 != r0) goto L21
                    goto L46
                L21:
                    if (r2 == 0) goto L3c
                    abza r2 = defpackage.abza.a
                    java.lang.Class r3 = r5.getClass()
                    abzj r2 = r2.a(r3)
                    boolean r2 = r2.l(r5)
                    if (r0 == r2) goto L34
                    goto L35
                L34:
                    r1 = r5
                L35:
                    r0 = 2
                    r5.cM(r0, r1)
                    if (r2 == 0) goto L3c
                    goto L46
                L3c:
                    abzz r5 = new abzz
                    r5.<init>()
                    abxv r5 = r5.a()
                    throw r5
                L46:
                    abla r5 = (defpackage.abla) r5
                    zyd r5 = defpackage.zxn.h(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qis.a(java.lang.Object):zyd");
            }
        };
        return zuz.h(zydVarA, wyo.c(zviVar), zwk.a);
    }
}
