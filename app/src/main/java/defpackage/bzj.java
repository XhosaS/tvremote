package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzj {
    public static final bzi a = new bzi();
    private static final String b = "bzj";
    private final int c;

    public bzj() {
        throw null;
    }

    public final byq a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bxy bxyVar;
        bxx bxxVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new byq(agrd.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iA = a.a(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = iA;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(iA));
        }
        bzi bziVar = a;
        List<SidecarDisplayFeature> listB = bziVar.b(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : listB) {
            sidecarDisplayFeature.getClass();
            String str = b;
            str.getClass();
            Object objB = new bxo(sidecarDisplayFeature, str, this.c, bxg.a).a("Type must be either TYPE_FOLD or TYPE_HINGE", new agux() { // from class: bze
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                    bzi bziVar2 = bzj.a;
                    sidecarDisplayFeature2.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature2.getType() != 1 && sidecarDisplayFeature2.getType() != 2) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).a("Feature bounds must not be 0", new agux() { // from class: bzf
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                    bzi bziVar2 = bzj.a;
                    sidecarDisplayFeature2.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).a("TYPE_FOLD must have 0 area", new agux() { // from class: bzg
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                    bzi bziVar2 = bzj.a;
                    sidecarDisplayFeature2.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature2.getType() == 1 && sidecarDisplayFeature2.getRect().width() != 0 && sidecarDisplayFeature2.getRect().height() != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).a("Feature be pinned to either left or top", new agux() { // from class: bzh
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                    bzi bziVar2 = bzj.a;
                    sidecarDisplayFeature2.getClass();
                    boolean z = true;
                    if (sidecarDisplayFeature2.getRect().left != 0 && sidecarDisplayFeature2.getRect().top != 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }).b();
            bxz bxzVar = null;
            if (objB != null) {
                int type = ((SidecarDisplayFeature) objB).getType();
                if (type == 1) {
                    bxyVar = bxy.a;
                } else if (type == 2) {
                    bxyVar = bxy.b;
                }
                int iA2 = bziVar.a(sidecarDeviceState2);
                if (iA2 == 2) {
                    bxxVar = bxx.b;
                } else if (iA2 == 3) {
                    bxxVar = bxx.a;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                bxzVar = new bxz(new bxh(rect), bxyVar, bxxVar);
            }
            if (bxzVar != null) {
                arrayList.add(bxzVar);
            }
        }
        return new byq(arrayList);
    }

    public bzj(byte[] bArr) {
        this.c = 3;
    }
}
