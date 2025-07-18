package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wli extends BroadcastReceiver implements wla {
    public static final zdy a = zdy.h("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    public long b;
    public zyh c;
    private final Class d;
    private agow e;

    protected wli(Class cls) {
        this.d = cls;
    }

    protected wlk a(Object obj) {
        throw null;
    }

    @Override // defpackage.wla
    public final /* synthetic */ long b() {
        return -1L;
    }

    @Override // defpackage.wla
    public final /* synthetic */ long c() {
        return -1L;
    }

    protected abstract zyd d(Context context, Class cls);

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0195, code lost:
    
        r3 = r18.getPackageManager();
        r11 = defpackage.tpp.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        if (defpackage.tpp.b != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a0, code lost:
    
        r12 = new android.content.Intent();
        r12.setPackage(r18.getPackageName());
        defpackage.tpp.b = r3.queryBroadcastReceivers(r12, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b2, code lost:
    
        r3 = defpackage.tpp.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b4, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b5, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
    
        if (r3.hasNext() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cd, code lost:
    
        if (r7.equals(((android.content.pm.ResolveInfo) r3.next()).activityInfo.name) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d5, code lost:
    
        throw new defpackage.tpo(r19);
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r18, final android.content.Intent r19) throws defpackage.tpo {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wli.onReceive(android.content.Context, android.content.Intent):void");
    }
}
