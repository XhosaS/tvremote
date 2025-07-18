package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xua {
    public final boolean a;
    public final boolean b;
    public final Object c;

    public xua(ByteBuffer byteBuffer, boolean z, boolean z2) {
        this.c = byteBuffer;
        this.a = z;
        this.b = z2;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vfc vfcVar = (vfc) it.next();
            if ("urn:mpeg:dash:role:2011".equals(vfcVar.b)) {
                arrayList.add(vfcVar.c);
            }
        }
        return arrayList;
    }

    public static boolean b(vex vexVar) {
        vew vewVarB = vew.b(vexVar.d);
        if (vewVarB == null) {
            vewVarB = vew.UNRECOGNIZED;
        }
        if (vewVarB != vew.UNRECOGNIZED && vewVarB != vew.CONTENT_TYPE_UNSPECIFIED) {
            return vewVarB == vew.VIDEO;
        }
        int iAO = a.aO(vexVar.c);
        if (iAO == 0) {
            iAO = 1;
        }
        return iAO == 3 || iAO == 6;
    }

    public xua(lzi lziVar, lfn lfnVar) {
        this.c = lziVar;
        this.a = lfnVar.bO();
        this.b = lfnVar.cZ();
    }
}
