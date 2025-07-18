package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aak extends Handler {
    public final WeakReference a;

    public aak(aai aaiVar) {
        this.a = new WeakReference(aaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dln dlnVar;
        aai aaiVar = (aai) this.a.get();
        if (aaiVar != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle bundlePeekData = message.peekData();
            switch (i) {
                case 0:
                    if (i2 == aaiVar.f) {
                        aaiVar.f = 0;
                        aao aaoVar = aaiVar.h;
                        if (aaoVar.d == aaiVar) {
                            aaoVar.o();
                        }
                    }
                    SparseArray sparseArray = aaiVar.g;
                    tj tjVar = (tj) sparseArray.get(i2);
                    if (tjVar != null) {
                        sparseArray.remove(i2);
                        tjVar.e(null, null);
                        return;
                    }
                    return;
                case 1:
                    return;
                case 2:
                    if (obj == null) {
                        obj = null;
                    } else if (obj instanceof Bundle) {
                    }
                    Bundle bundle = (Bundle) obj;
                    if (aaiVar.e == 0 && i2 == aaiVar.f && i3 > 0) {
                        aaiVar.f = 0;
                        aaiVar.e = i3;
                        aao aaoVar2 = aaiVar.h;
                        aaoVar2.l(aaiVar, zo.a(bundle));
                        if (aaoVar2.d == aaiVar) {
                            aaoVar2.e = true;
                            ArrayList arrayList = aaoVar2.b;
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((aaj) arrayList.get(i4)).e(aaoVar2.d);
                            }
                            zg zgVar = aaoVar2.h;
                            if (zgVar != null) {
                                aaoVar2.d.c(zgVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    break;
                case 3:
                    if (obj == null) {
                        obj = null;
                    } else if (obj instanceof Bundle) {
                    }
                    SparseArray sparseArray2 = aaiVar.g;
                    Bundle bundle2 = (Bundle) obj;
                    tj tjVar2 = (tj) sparseArray2.get(i2);
                    if (tjVar2 != null) {
                        sparseArray2.remove(i2);
                        tjVar2.f(bundle2);
                        return;
                    }
                    break;
                case 4:
                    if (obj == null) {
                        obj = null;
                    } else if (obj instanceof Bundle) {
                    }
                    String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                    Bundle bundle3 = (Bundle) obj;
                    SparseArray sparseArray3 = aaiVar.g;
                    tj tjVar3 = (tj) sparseArray3.get(i2);
                    if (tjVar3 != null) {
                        sparseArray3.remove(i2);
                        tjVar3.e(string, bundle3);
                        return;
                    }
                    break;
                case 5:
                    if (obj == null) {
                        obj = null;
                    } else if (obj instanceof Bundle) {
                    }
                    Bundle bundle4 = (Bundle) obj;
                    if (aaiVar.e != 0) {
                        aaiVar.h.l(aaiVar, zo.a(bundle4));
                        return;
                    }
                    break;
                case 6:
                    if (obj instanceof Bundle) {
                        Bundle bundle5 = (Bundle) obj;
                        SparseArray sparseArray4 = aaiVar.g;
                        tj tjVar4 = (tj) sparseArray4.get(i2);
                        if (bundle5 == null || !bundle5.containsKey("routeId")) {
                            tjVar4.e("DynamicGroupRouteController is created without valid route id.", bundle5);
                            break;
                        } else {
                            sparseArray4.remove(i2);
                            tjVar4.f(bundle5);
                            break;
                        }
                    } else {
                        Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                        break;
                    }
                case 7:
                    if (obj == null) {
                        obj = null;
                    } else if (obj instanceof Bundle) {
                    }
                    Bundle bundle6 = (Bundle) obj;
                    if (aaiVar.e != 0) {
                        Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                        zf zfVarL = bundle7 != null ? zf.l(bundle7) : null;
                        ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = parcelableArrayList.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            Bundle bundle8 = (Bundle) parcelableArrayList.get(i5);
                            if (bundle8 == null) {
                                dlnVar = null;
                            } else {
                                zf zfVarL2 = zf.l(bundle8.getBundle("mrDescriptor"));
                                int i6 = bundle8.getInt("selectionState", 1);
                                bundle8.getBoolean("isUnselectable", false);
                                bundle8.getBoolean("isGroupable", false);
                                bundle8.getBoolean("isTransferable", false);
                                dlnVar = new dln(zfVarL2, i6);
                            }
                            arrayList2.add(dlnVar);
                        }
                        aao aaoVar3 = aaiVar.h;
                        if (aaoVar3.d == aaiVar) {
                            aaj aajVarE = aaoVar3.e(i3);
                            if (aajVarE instanceof aam) {
                                ((aam) aajVarE).k(zfVarL, arrayList2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    break;
                case 8:
                    aao aaoVar4 = aaiVar.h;
                    if (aaoVar4.d == aaiVar) {
                        aaj aajVarE2 = aaoVar4.e(i3);
                        byj byjVar = aaoVar4.n;
                        if (byjVar != null && (aajVarE2 instanceof zl)) {
                            zl zlVar = (zl) aajVarE2;
                            yv yvVar = (yv) ((aar) byjVar.a).b;
                            if (yvVar.e == zlVar) {
                                yvVar.j(yvVar.d(), 2, true);
                            }
                        }
                        if (aajVarE2 != 0) {
                            aaoVar4.m(aajVarE2);
                            break;
                        }
                    }
                    break;
            }
            int i7 = aao.o;
        }
    }
}
