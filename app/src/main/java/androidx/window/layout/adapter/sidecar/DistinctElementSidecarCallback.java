package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.agvy;
import defpackage.bzi;
import defpackage.bzj;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    private SidecarDeviceState b;
    private final SidecarInterface.SidecarCallback d;
    private final Object a = new Object();
    private final Map c = new WeakHashMap();

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback, byte[] bArr) {
        this.d = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r2.a(r1) == r2.a(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            androidx.window.sidecar.SidecarDeviceState r1 = r3.b     // Catch: java.lang.Throwable -> L29
            boolean r2 = defpackage.agvy.c(r1, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto Lf
            goto L1e
        Lf:
            if (r1 != 0) goto L12
            goto L20
        L12:
            bzi r2 = defpackage.bzj.a     // Catch: java.lang.Throwable -> L29
            int r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L29
            int r2 = r2.a(r4)     // Catch: java.lang.Throwable -> L29
            if (r1 != r2) goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L20:
            r3.b = r4     // Catch: java.lang.Throwable -> L29
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.d     // Catch: java.lang.Throwable -> L29
            r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.a) {
            Map map = this.c;
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) map.get(iBinder);
            if (!agvy.c(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                    bzi bziVar = bzj.a;
                    List listB = bziVar.b(sidecarWindowLayoutInfo2);
                    List listB2 = bziVar.b(sidecarWindowLayoutInfo);
                    if (listB != listB2) {
                        if (listB.size() == listB2.size()) {
                            int size = listB.size();
                            for (int i = 0; i < size; i++) {
                                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) listB.get(i);
                                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) listB2.get(i);
                                if (!agvy.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
                                    if (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && agvy.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect())) {
                                    }
                                }
                            }
                        }
                    }
                }
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public DistinctElementSidecarCallback(SidecarInterface.SidecarCallback sidecarCallback) {
        bzi bziVar = bzj.a;
        this.d = sidecarCallback;
    }
}
