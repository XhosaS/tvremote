package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbm extends BroadcastReceiver {
    public static final IntentFilter a;
    public static final IntentFilter b;
    private final dyd c;
    private boolean g;
    private boolean h;
    private final jwq i;
    private ieg f = ieg.a;
    private final boolean d = true;
    private final boolean e = true;

    static {
        IntentFilter intentFilter = new IntentFilter();
        a = intentFilter;
        IntentFilter intentFilter2 = new IntentFilter();
        b = intentFilter2;
        intentFilter.addAction("com.google.android.videos.PURCHASE_SYNC_ERROR");
        intentFilter.addAction("com.google.android.videos.PURCHASE_SYNC_COMPLETED");
        intentFilter2.addAction("com.google.android.videos.WISHLIST_SYNC_COMPLETED");
        intentFilter2.addAction("com.google.android.videos.WISHLIST_SYNC_ERROR");
    }

    public mbm(Context context, jwq jwqVar) {
        this.c = dyd.a(context);
        this.i = jwqVar;
    }

    public final void a(ieg iegVar) {
        this.f = iegVar;
        boolean z = this.d;
        this.g = z;
        boolean z2 = this.e;
        this.h = z2;
        if (z) {
            this.c.b(this, a);
        }
        if (z2) {
            this.c.b(this, b);
        }
    }

    public final void b() {
        this.g = false;
        this.h = false;
        this.f = ieg.a;
        this.c.c(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(ksn.c(this.f), intent.getStringExtra("authAccount"))) {
            String action = intent.getAction();
            switch (action.hashCode()) {
                case -527157197:
                    if (action.equals("com.google.android.videos.PURCHASE_SYNC_ERROR")) {
                        this.g = false;
                        this.i.Z();
                        break;
                    }
                    break;
                case -340908817:
                    if (action.equals("com.google.android.videos.WISHLIST_SYNC_ERROR")) {
                        this.h = false;
                        this.i.ab();
                        break;
                    }
                    break;
                case 100234674:
                    if (action.equals("com.google.android.videos.WISHLIST_SYNC_COMPLETED")) {
                        this.h = false;
                        this.i.ac();
                        break;
                    }
                    break;
                case 660358902:
                    if (action.equals("com.google.android.videos.PURCHASE_SYNC_COMPLETED")) {
                        this.g = false;
                        this.i.aa();
                        break;
                    }
                    break;
            }
            if (this.g || this.h) {
                return;
            }
            b();
        }
    }
}
