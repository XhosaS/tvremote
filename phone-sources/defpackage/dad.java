package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.appcompat.R;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dad {
    public static final cuy a(View view, cuy cuyVar) {
        CharSequence charSequenceCoerceToStyledText;
        cuw cuwVar = cuyVar.a;
        if (cuwVar.b() == 2) {
            return cuyVar;
        }
        ClipData clipDataC = cuwVar.c();
        int iA = cuwVar.a();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataC.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataC.getItemAt(i);
            if ((iA & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                }
                z = true;
            }
        }
        return null;
    }

    public static final void b(View view) {
        view.getClass();
        Iterator itA = new cxb(new akx(view, (yih) null, 2), 3).a();
        while (itA.hasNext()) {
            j((View) itA.next()).e();
        }
    }

    public static final dwt c(dwx dwxVar, ymh ymhVar, dxj dxjVar) {
        try {
            try {
                return dwxVar.c(ymhVar, dxjVar);
            } catch (AbstractMethodError unused) {
                return dwxVar.b(wef.o(ymhVar), dxjVar);
            }
        } catch (AbstractMethodError unused2) {
            return dwxVar.a(wef.o(ymhVar));
        }
    }

    public static final dwx d(Map map) {
        Collection collectionValues = map.values();
        collectionValues.getClass();
        dwi[] dwiVarArr = (dwi[]) collectionValues.toArray(new dwi[0]);
        return new dxk((dwi[]) Arrays.copyOf(dwiVarArr, dwiVarArr.length));
    }

    public static final void e(ymh ymhVar, yjv yjvVar, Map map) {
        yjvVar.getClass();
        if (!map.containsKey(ymhVar)) {
            map.put(ymhVar, new dwi(ymhVar, yjvVar));
            return;
        }
        throw new IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + dhf.g(ymhVar) + '.');
    }

    public static final void f(dvc dvcVar, dvk dvkVar, yjk yjkVar, bao baoVar, int i) {
        int i2;
        dvc dvcVar2;
        Object obj;
        bao baoVarD = baoVar.d(-709389590);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.D(dvcVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            dvcVar2 = dvcVar;
            obj = dvkVar;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                dvkVar = (dvk) baoVarD.f(dxf.a);
            } else {
                baoVarD.t();
            }
            Object obj2 = dvkVar;
            baoVarD.m();
            if (dvcVar == dvc.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            bdy bdyVarBR = a.bR(yjkVar, baoVarD);
            boolean zF = baoVarD.F(bdyVarBR) | ((i2 & 14) == 4) | baoVarD.H(obj2);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zF || objT == ban.a) {
                dvcVar2 = dvcVar;
                gk gkVar = new gk(obj2, (Object) dvcVar2, (Object) bdyVarBR, 16, (byte[]) null);
                basVar.ae(gkVar);
                objT = gkVar;
            } else {
                dvcVar2 = dvcVar;
            }
            bbn.c(obj2, (yjv) objT, baoVarD);
            obj = obj2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(dvcVar2, obj, yjkVar, i, 13);
        }
    }

    public static final bdy g(ysx ysxVar, Object obj, dve dveVar, dvd dvdVar, yil yilVar, bao baoVar, int i) {
        boolean z = true;
        Object[] objArr = {ysxVar, dveVar, dvdVar, yilVar};
        int i2 = (i & 7168) ^ 3072;
        boolean zH = baoVar.H(dveVar);
        if ((i2 <= 2048 || !baoVar.D(dvdVar.ordinal())) && (i & 3072) != 2048) {
            z = false;
        }
        boolean zH2 = zH | z | baoVar.H(yilVar) | baoVar.H(ysxVar);
        Object objG = baoVar.g();
        if (zH2 || objG == ban.a) {
            Object dxeVar = new dxe(dveVar, dvdVar, yilVar, ysxVar, (yih) null, 0);
            baoVar.A(dxeVar);
            objG = dxeVar;
        }
        yjz yjzVar = (yjz) objG;
        Object objG2 = baoVar.g();
        Object obj2 = ban.a;
        if (objG2 == obj2) {
            Object bciVar = new bci(obj, bcz.c);
            baoVar.A(bciVar);
            objG2 = bciVar;
        }
        bcb bcbVar = (bcb) objG2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH3 = baoVar.H(yjzVar);
        Object objG3 = baoVar.g();
        if (zH3 || objG3 == obj2) {
            Object ucVar = new uc(yjzVar, bcbVar, (yih) null, 9, (char[]) null);
            baoVar.A(ucVar);
            objG3 = ucVar;
        }
        yjz yjzVar2 = (yjz) objG3;
        yil yilVarH = baoVar.h();
        boolean zF = false;
        for (Object obj3 : Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)) {
            zF |= baoVar.F(obj3);
        }
        Object objG4 = baoVar.g();
        if (!zF && objG4 != obj2) {
            return bcbVar;
        }
        baoVar.A(new bbu(yilVarH, yjzVar2));
        return bcbVar;
    }

    public static final bdy h(ysx ysxVar, Object obj, dvd dvdVar, bao baoVar, int i, int i2) {
        dvk dvkVar = (i2 & 2) != 0 ? (dvk) baoVar.f(dxf.a) : null;
        if ((i2 & 4) != 0) {
            dvdVar = dvd.d;
        }
        dvd dvdVar2 = dvdVar;
        yim yimVar = yim.a;
        return g(ysxVar, obj, dvkVar.getLifecycle(), dvdVar2, yimVar, baoVar, (i & 14) | (((i >> 3) & 8) << 3) | (i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i & 7168));
    }

    public static final bdy i(yva yvaVar, bao baoVar) {
        dvk dvkVar = (dvk) baoVar.f(dxf.a);
        return g(yvaVar, yvaVar.d(), dvkVar.getLifecycle(), dvd.d, yim.a, baoVar, 0);
    }

    public static final cvw j(View view) {
        cvw cvwVar = (cvw) view.getTag(com.google.android.videos.R.id.pooling_container_listener_holder_tag);
        if (cvwVar != null) {
            return cvwVar;
        }
        cvw cvwVar2 = new cvw((byte[]) null);
        view.setTag(com.google.android.videos.R.id.pooling_container_listener_holder_tag, cvwVar2);
        return cvwVar2;
    }
}
