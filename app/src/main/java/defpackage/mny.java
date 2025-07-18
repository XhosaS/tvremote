package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mny {
    public static final String a = "mny";
    public static final AtomicInteger b = new AtomicInteger();
    private static final Handler c = new Handler(Looper.getMainLooper());
    private static final BreakIterator d = BreakIterator.getCharacterInstance();

    private mny() {
    }

    public static void a(View view) {
        view.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    public static nzx b(View view, ocj ocjVar, int i) {
        nzv nzvVarP = nzx.p();
        nzvVarP.f(view);
        nyu nyuVar = (nyu) nzvVarP;
        nyuVar.e = ocjVar;
        nyuVar.h = i;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String string = editText.getText().toString();
            acry acryVar = acry.a;
            acrx acrxVar = new acrx();
            if ((acrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acrxVar.y();
            }
            acry acryVar2 = (acry) acrxVar.b;
            string.getClass();
            acryVar2.b |= 1;
            acryVar2.c = string;
            acry acryVar3 = (acry) acrxVar.v();
            acvs acvsVar = acvs.a;
            acvr acvrVar = new acvr();
            if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvrVar.y();
            }
            acvs acvsVar2 = (acvs) acvrVar.b;
            acryVar3.getClass();
            acvsVar2.d = acryVar3;
            acvsVar2.c |= 1;
            boolean zIsFocused = view.isFocused();
            if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvrVar.y();
            }
            acvs acvsVar3 = (acvs) acvrVar.b;
            acvsVar3.c |= 8;
            acvsVar3.f = zIsFocused;
            int selectionEnd = editText.getSelectionEnd();
            if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvrVar.y();
            }
            acvs acvsVar4 = (acvs) acvrVar.b;
            acvsVar4.c |= 2;
            acvsVar4.e = selectionEnd;
            BreakIterator breakIterator = d;
            breakIterator.setText(string);
            breakIterator.first();
            int i2 = 0;
            while (breakIterator.next() != -1) {
                i2++;
            }
            if ((acvrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acvrVar.y();
            }
            acvs acvsVar5 = (acvs) acvrVar.b;
            acvsVar5.c |= 16;
            acvsVar5.g = i2;
            acvs acvsVar6 = (acvs) acvrVar.v();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
            acyk acykVar = new acyk();
            acykVar.f(acvs.b, acvsVar6);
            nyuVar.c = (SenderStateOuterClass$SenderState) acykVar.v();
        }
        return nzvVarP.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r9v28, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.drq c(final defpackage.dru r27, @defpackage.eau defpackage.nhw r28, @defpackage.eau defpackage.ogq r29, @defpackage.eau defpackage.ogq r30, @defpackage.eau defpackage.ogq r31, @defpackage.eau defpackage.ogq r32, @defpackage.eau defpackage.ofy r33, @defpackage.eau defpackage.oco r34, @defpackage.eau defpackage.mrg r35, @defpackage.eau boolean r36, @defpackage.eau boolean r37, @defpackage.eau boolean r38, @defpackage.eau defpackage.oaa r39, @defpackage.eau defpackage.oal r40, @defpackage.eau java.util.Map r41, defpackage.mnu r42, java.util.concurrent.atomic.AtomicBoolean r43, java.util.Set r44, defpackage.mnw r45) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mny.c(dru, nhw, ogq, ogq, ogq, ogq, ofy, oco, mrg, boolean, boolean, boolean, oaa, oal, java.util.Map, mnu, java.util.concurrent.atomic.AtomicBoolean, java.util.Set, mnw):drq");
    }

    private static void d(int i, ekp ekpVar, int i2) {
        ekr ekrVar = ekpVar.a;
        ekrVar.t = i;
        ekrVar.B = (-131073) & i2;
    }

    private static boolean e(ndo ndoVar) {
        if (ndoVar.l() == 1) {
            nep nepVarR = ndoVar.r(0);
            long length = ndoVar.w() ? ndoVar.s().length() : 0L;
            long jL = nepVarR.x() ? nepVarR.l() : length;
            if (nepVarR.m() == 0 && length <= jL) {
                return true;
            }
        }
        return false;
    }
}
