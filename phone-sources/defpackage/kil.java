package defpackage;

import android.media.MediaCodecInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kil implements yjv {
    private final /* synthetic */ int a;

    public /* synthetic */ kil(int i) {
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        itg itgVarA;
        switch (this.a) {
            case 0:
                ith ithVar = (ith) obj;
                if (ithVar != null) {
                    return ithVar.b();
                }
                return null;
            case 1:
                itf itfVar = (itf) obj;
                if (itfVar != null && (itgVarA = itfVar.a()) != null) {
                    z = itgVarA.a;
                }
                return Boolean.valueOf(z);
            case 2:
                iwc iwcVar = (iwc) obj;
                return Boolean.valueOf(iwcVar != null ? iwcVar.c() : false);
            case 3:
                iwc iwcVar2 = (iwc) obj;
                if (iwcVar2 != null) {
                    return iwcVar2.a();
                }
                return null;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                ith ithVar2 = (ith) obj;
                ithVar2.getClass();
                ithVar2.j();
                return ygi.a;
            case 6:
                ith ithVar3 = (ith) obj;
                ithVar3.getClass();
                ithVar3.f();
                return ygi.a;
            case 7:
                return Boolean.valueOf(!((ith) obj).o());
            case 8:
                cfc cfcVar = (cfc) obj;
                cfcVar.getClass();
                cfk.y(cfcVar);
                return ygi.a;
            case 9:
                cfc cfcVar2 = (cfc) obj;
                cfcVar2.getClass();
                cfk.y(cfcVar2);
                cfk.p(cfcVar2, 2.0f);
                return ygi.a;
            case 10:
                ((Integer) obj).intValue();
                return ygi.a;
            case 11:
                cfc cfcVar3 = (cfc) obj;
                cfcVar3.getClass();
                cfk.d(cfcVar3);
                return ygi.a;
            case 12:
                ((bpq) obj).getClass();
                return ygi.a;
            case 13:
                cfc cfcVar4 = (cfc) obj;
                cfcVar4.getClass();
                cfk.d(cfcVar4);
                return ygi.a;
            case 14:
                cfc cfcVar5 = (cfc) obj;
                cfcVar5.getClass();
                cfk.d(cfcVar5);
                return ygi.a;
            case 15:
                ((lul) obj).getClass();
                return kvk.a;
            case 16:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(yfm.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(jwq.Y((loq) it.next()));
                }
                return arrayList;
            case 17:
                return true;
            case 18:
                Byte b = (Byte) obj;
                b.byteValue();
                String str = String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
                str.getClass();
                return str;
            case 19:
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = (MediaCodecInfo.CodecProfileLevel) obj;
                int i = ouo.b;
                codecProfileLevel.getClass();
                return Boolean.valueOf(codecProfileLevel.profile == 4096);
            default:
                int i2 = ouo.b;
                ((MediaCodecInfo.CodecProfileLevel) obj).getClass();
                return true;
        }
    }
}
