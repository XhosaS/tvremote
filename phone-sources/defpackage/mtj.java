package defpackage;

import android.os.AsyncTask;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mtj extends AsyncTask {
    final /* synthetic */ lwx a;
    final /* synthetic */ lwh b;
    final /* synthetic */ mtk c;

    public mtj(mtk mtkVar, lwx lwxVar, lwh lwhVar) {
        this.a = lwxVar;
        this.b = lwhVar;
        this.c = mtkVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) throws vuq {
        try {
            lwx lwxVar = this.a;
            lwh lwhVar = this.b;
            a.aD(lwxVar.e.contains(lwhVar), "chunkInfo must be from this tag stream");
            try {
                int i = lwhVar.a;
                vsz vszVar = lwxVar.a;
                int i2 = lwhVar.c;
                vsz vszVarJ = vszVar.j(i2, lwhVar.d + i2);
                lww lwwVar = new lww(lwxVar, i);
                vte vteVarK = vszVarJ.k();
                vteVarK.H();
                lwwVar.h = new SparseArray();
                boolean z = true;
                while (!vteVarK.C()) {
                    vsz vszVarW = vteVarK.w();
                    vtp vtpVarA = vtp.a();
                    tpf tpfVar = tpf.a;
                    vte vteVarK2 = vszVarW.k();
                    vuc vucVarO = tpfVar.o();
                    try {
                        vvy vvyVarB = vvs.a.b(vucVarO);
                        vvyVarB.l(vucVarO, vtf.p(vteVarK2), vtpVarA);
                        vvyVarB.g(vucVarO);
                        try {
                            vteVarK2.z(0);
                            vuc.B(vucVarO);
                            tpf tpfVar2 = (tpf) vucVarO;
                            int iA = lwwVar.b;
                            if (!z) {
                                int i3 = tpfVar2.b;
                                if (i3 <= 0) {
                                    throw new vuq("Frame invalid - no or non-positive offset");
                                }
                                int i4 = lwwVar.e + i3;
                                lwwVar.e = i4;
                                iA += lwwVar.a.a(i4);
                            }
                            int i5 = lwwVar.g;
                            kp kpVar = lwwVar.c;
                            boolean z2 = i5 >= kpVar.c();
                            if (z2) {
                                kpVar.f(iA, lwwVar.h);
                            }
                            Iterator<E> it = tpfVar2.c.iterator();
                            while (it.hasNext()) {
                                lwwVar.a((tph) it.next(), iA, z2, true);
                            }
                            Iterator<E> it2 = tpfVar2.d.iterator();
                            while (it2.hasNext()) {
                                lwwVar.a((tph) it2.next(), iA, z2, false);
                            }
                            int i6 = lwwVar.f;
                            if (i6 == 0) {
                                kpVar.i(lwwVar.g);
                            } else if (i6 >= 50) {
                                SparseArray sparseArray = lwwVar.d;
                                lwwVar.h = new SparseArray(sparseArray.size());
                                for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                                    lwn lwnVar = (lwn) sparseArray.valueAt(i7);
                                    if (lwnVar.c) {
                                        lwwVar.h.put(lwnVar.a, lwnVar);
                                    }
                                }
                                lwwVar.g++;
                                lwwVar.f = 0;
                            }
                            z = false;
                        } catch (vuq e) {
                            throw e;
                        }
                    } catch (vuq e2) {
                        if (e2.a) {
                            throw new vuq(e2);
                        }
                        throw e2;
                    } catch (IOException e3) {
                        if (e3.getCause() instanceof vuq) {
                            throw ((vuq) e3.getCause());
                        }
                        throw new vuq(e3);
                    } catch (vwf e4) {
                        throw e4.a();
                    } catch (RuntimeException e5) {
                        if (e5.getCause() instanceof vuq) {
                            throw ((vuq) e5.getCause());
                        }
                        throw e5;
                    }
                }
                kp kpVar2 = lwwVar.c;
                int iC = kpVar2.c();
                int[] iArr = new int[iC];
                lwn[][] lwnVarArr = new lwn[iC][];
                for (int i8 = 0; i8 < iC; i8++) {
                    iArr[i8] = kpVar2.b(i8);
                    SparseArray sparseArray2 = (SparseArray) kpVar2.e(i8);
                    lwn[] lwnVarArr2 = new lwn[sparseArray2.size()];
                    for (int i9 = 0; i9 < sparseArray2.size(); i9++) {
                        lwnVarArr2[i9] = (lwn) sparseArray2.valueAt(i9);
                    }
                    lwnVarArr[i8] = lwnVarArr2;
                }
                kpVar2.g();
                lwwVar.d.clear();
                lwwVar.h = null;
                return new kuw(iArr, lwnVarArr);
            } catch (vuq e6) {
                lwxVar.g = false;
                throw e6;
            }
        } catch (IOException e7) {
            lwh lwhVar2 = this.b;
            krd.d("Failed to load chunk for " + lwhVar2.a + " - " + lwhVar2.b, e7);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        mtk mtkVar = this.c;
        kuw kuwVar = (kuw) obj;
        lwh lwhVar = mtkVar.d;
        lwh lwhVar2 = this.b;
        if (lwhVar != lwhVar2) {
            return;
        }
        mtkVar.c = lwhVar2;
        mtkVar.g = kuwVar;
        mtkVar.d = null;
        if (mtkVar.e != -1) {
            mtkVar.d();
            mgf mgfVar = mtkVar.b;
            if (mgfVar != null) {
                mgfVar.c();
            }
        }
    }
}
