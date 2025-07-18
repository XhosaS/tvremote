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
final class fvo extends Handler {
    public final WeakReference a;

    public fvo(fvm fvmVar) {
        this.a = new WeakReference(fvmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fvm fvmVar = (fvm) this.a.get();
        if (fvmVar != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle bundlePeekData = message.peekData();
            if (i == 0) {
                if (i2 == fvmVar.f) {
                    fvmVar.f = 0;
                    fvs fvsVar = fvmVar.h;
                    if (fvsVar.d == fvmVar) {
                        fvsVar.p();
                    }
                }
                SparseArray sparseArray = fvmVar.g;
                fus fusVar = (fus) sparseArray.get(i2);
                if (fusVar != null) {
                    sparseArray.remove(i2);
                    fusVar.a(null, null);
                    return;
                }
                return;
            }
            switch (i) {
                case 2:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    Bundle bundle = (Bundle) obj;
                    if (fvmVar.e == 0 && i2 == fvmVar.f && i3 > 0) {
                        fvmVar.f = 0;
                        fvmVar.e = i3;
                        fvs fvsVar2 = fvmVar.h;
                        fvsVar2.m(fvmVar, fuq.a(bundle));
                        if (fvsVar2.d == fvmVar) {
                            fvsVar2.l = true;
                            ArrayList arrayList = fvsVar2.b;
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((fvn) arrayList.get(i4)).h(fvsVar2.d);
                            }
                            fuh fuhVar = fvsVar2.g;
                            if (fuhVar != null) {
                                fvsVar2.d.c(fuhVar);
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    SparseArray sparseArray2 = fvmVar.g;
                    Bundle bundle2 = (Bundle) obj;
                    fus fusVar2 = (fus) sparseArray2.get(i2);
                    if (fusVar2 != null) {
                        sparseArray2.remove(i2);
                        fusVar2.b(bundle2);
                        break;
                    }
                    break;
                case 4:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                    Bundle bundle3 = (Bundle) obj;
                    SparseArray sparseArray3 = fvmVar.g;
                    fus fusVar3 = (fus) sparseArray3.get(i2);
                    if (fusVar3 != null) {
                        sparseArray3.remove(i2);
                        fusVar3.a(string, bundle3);
                        break;
                    }
                    break;
                case 5:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    Bundle bundle4 = (Bundle) obj;
                    if (fvmVar.e != 0) {
                        fvmVar.h.m(fvmVar, fuq.a(bundle4));
                        break;
                    }
                    break;
                case 6:
                    if (obj instanceof Bundle) {
                        Bundle bundle5 = (Bundle) obj;
                        SparseArray sparseArray4 = fvmVar.g;
                        fus fusVar4 = (fus) sparseArray4.get(i2);
                        if (bundle5 == null || !bundle5.containsKey("routeId")) {
                            fusVar4.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                            break;
                        } else {
                            sparseArray4.remove(i2);
                            fusVar4.b(bundle5);
                            break;
                        }
                    } else {
                        Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                        break;
                    }
                    break;
                case 7:
                    if (obj == null) {
                        obj = null;
                    } else if (!(obj instanceof Bundle)) {
                    }
                    Bundle bundle6 = (Bundle) obj;
                    if (fvmVar.e != 0) {
                        Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                        fug fugVarL = bundle7 != null ? fug.l(bundle7) : null;
                        ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = parcelableArrayList.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            Bundle bundle8 = (Bundle) parcelableArrayList.get(i5);
                            arrayList2.add(bundle8 == null ? null : new fui(fug.l(bundle8.getBundle("mrDescriptor")), bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false)));
                        }
                        fvs fvsVar3 = fvmVar.h;
                        if (fvsVar3.d == fvmVar) {
                            fvn fvnVarA = fvsVar3.a(i3);
                            if (fvnVarA instanceof fvq) {
                                ((fvq) fvnVarA).p(fugVarL, arrayList2);
                                break;
                            }
                        }
                    }
                    break;
                case 8:
                    fvs fvsVar4 = fvmVar.h;
                    if (fvsVar4.d == fvmVar) {
                        fvn fvnVarA2 = fvsVar4.a(i3);
                        pku pkuVar = fvsVar4.n;
                        if (pkuVar != null && (fvnVarA2 instanceof fun)) {
                            fun funVar = (fun) fvnVarA2;
                            ftw ftwVar = (ftw) ((fvu) pkuVar.a).i;
                            if (ftwVar.e == funVar) {
                                ftwVar.l(ftwVar.d(), 2, true);
                            }
                        }
                        if (fvnVarA2 != 0) {
                            fvsVar4.n(fvnVarA2);
                            break;
                        }
                    }
                    break;
            }
        }
    }
}
