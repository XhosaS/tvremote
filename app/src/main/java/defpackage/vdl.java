package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdl extends BroadcastReceiver {
    private final vdm a;

    public vdl(vdm vdmVar) {
        this.a = vdmVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1546068393:
                if (action.equals("com.google.android.testing.assistantreadinesstest.action.HOTWORD_TONE_ON")) {
                    this.a.b();
                    break;
                }
                break;
            case -683480105:
                if (action.equals("com.google.android.testing.assistantreadinesstest.action.HOTWORD_TONE_OFF")) {
                    this.a.a();
                    break;
                }
                break;
            case 857877801:
                if (action.equals("com.google.android.testing.assistantreadinesstest.action.QUICK_PHRASE_TONE_OFF")) {
                    this.a.c();
                    break;
                }
                break;
            case 1967336133:
                if (action.equals("com.google.android.testing.assistantreadinesstest.action.QUICK_PHRASE_TONE_ON")) {
                    this.a.d();
                    break;
                }
                break;
        }
    }
}
