package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajf implements InputConnection {
    public final aik a;
    private final bfz b = new bfz(new yjv[16], 0);
    private final aje c;
    private final InputConnection d;

    public ajf(aik aikVar, EditorInfo editorInfo) {
        this.a = aikVar;
        aje ajeVar = new aje(this);
        this.c = ajeVar;
        this.d = czi.a(ajeVar, editorInfo, new cze(this, 1));
    }

    private final ahx a() {
        return this.a.b.e();
    }

    private final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.a.a.c();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.h();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return this.d.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        int i2 = 1;
        if (charSequence == null) {
            return true;
        }
        this.a.a(new aps(charSequence.toString(), i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        this.a.a(new aiz(i, i2, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.a(new aiz(i, i2, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.a.a.b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.a(new afh(8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), chb.d(a().d), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        ahx ahxVarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = ahxVarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = ahxVarA.a();
        extractedText.partialStartOffset = -1;
        long j = ahxVarA.d;
        extractedText.selectionStart = chb.d(j);
        extractedText.selectionEnd = chb.c(j);
        extractedText.flags = !ylh.N(ahxVarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        String string = chb.g(a().d) ? null : ht.n(a()).toString();
        Objects.toString(string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        ahx ahxVarA = a();
        long j = ahxVarA.d;
        return ahxVarA.subSequence(chb.c(j), Math.min(chb.c(j) + i, ahxVarA.a())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        ahx ahxVarA = a();
        long j = ahxVarA.d;
        return ahxVarA.subSequence(Math.max(0, chb.d(j) - i), chb.d(j)).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                hu.C(this.a, 0, a().a());
                return false;
            case R.id.cut:
                b(277);
                return false;
            case R.id.copy:
                b(278);
                return false;
            case R.id.paste:
                b(279);
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performEditorAction(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L13
            switch(r4) {
                case 2: goto L11;
                case 3: goto Lf;
                case 4: goto Ld;
                case 5: goto Lb;
                case 6: goto L9;
                case 7: goto L7;
                default: goto L6;
            }
        L6:
            goto L13
        L7:
            r4 = 5
            goto L14
        L9:
            r4 = 7
            goto L14
        Lb:
            r4 = 6
            goto L14
        Ld:
            r4 = 4
            goto L14
        Lf:
            r4 = 3
            goto L14
        L11:
            r4 = 2
            goto L14
        L13:
            r4 = r0
        L14:
            aik r1 = r3.a
            yjv r1 = r1.c
            if (r1 == 0) goto L22
            cjz r2 = new cjz
            r2.<init>(r4)
            r1.a(r2)
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajf.performEditorAction(int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        long jG;
        int iIntValue;
        int i2;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        aik aikVar = this.a;
        int I = 2;
        int i3 = 1;
        if (Build.VERSION.SDK_INT >= 34) {
            akb akbVar = aikVar.b;
            lhr lhrVar = aikVar.i;
            yjk yjkVar = aikVar.f;
            cds cdsVar = aikVar.g;
            if (fd$$ExternalSyntheticApiModelOutline0.m388m((Object) handwritingGesture)) {
                SelectGesture selectGestureM382m = fd$$ExternalSyntheticApiModelOutline0.m382m((Object) handwritingGesture);
                long jR = hu.R(lhrVar, bnj.q(selectGestureM382m.getSelectionArea()), hu.L(selectGestureM382m.getGranularity()), cgw.b);
                if (chb.g(jR)) {
                    I = hu.I(akbVar, selectGestureM382m);
                    i = 1;
                } else {
                    akbVar.j(jR);
                    if (yjkVar != null) {
                        yjkVar.a();
                    }
                    I = 1;
                    i = 1;
                }
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$4(handwritingGesture)) {
                DeleteGesture deleteGestureM = fd$$ExternalSyntheticApiModelOutline0.m((Object) handwritingGesture);
                int iL = hu.L(deleteGestureM.getGranularity());
                long jR2 = hu.R(lhrVar, bnj.q(deleteGestureM.getDeletionArea()), iL, cgw.b);
                if (chb.g(jR2)) {
                    I = hu.I(akbVar, deleteGestureM);
                    i = 1;
                } else {
                    hu.K(akbVar, jR2, a.r(iL, 1));
                    I = 1;
                    i = 1;
                }
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$5(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureM383m = fd$$ExternalSyntheticApiModelOutline0.m383m((Object) handwritingGesture);
                long jS = hu.S(lhrVar, bnj.q(selectRangeGestureM383m.getSelectionStartArea()), bnj.q(selectRangeGestureM383m.getSelectionEndArea()), hu.L(selectRangeGestureM383m.getGranularity()), cgw.b);
                if (chb.g(jS)) {
                    I = hu.I(akbVar, selectRangeGestureM383m);
                    i = 1;
                } else {
                    akbVar.j(jS);
                    if (yjkVar != null) {
                        yjkVar.a();
                    }
                    I = 1;
                    i = 1;
                }
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$3(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureM378m = fd$$ExternalSyntheticApiModelOutline0.m378m((Object) handwritingGesture);
                int iL2 = hu.L(deleteRangeGestureM378m.getGranularity());
                long jS2 = hu.S(lhrVar, bnj.q(deleteRangeGestureM378m.getDeletionStartArea()), bnj.q(deleteRangeGestureM378m.getDeletionEndArea()), iL2, cgw.b);
                if (chb.g(jS2)) {
                    I = hu.I(akbVar, deleteRangeGestureM378m);
                    i = 1;
                } else {
                    hu.K(akbVar, jS2, a.r(iL2, 1));
                    I = 1;
                    i = 1;
                }
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$6(handwritingGesture)) {
                JoinOrSplitGesture joinOrSplitGestureM380m = fd$$ExternalSyntheticApiModelOutline0.m380m((Object) handwritingGesture);
                if (akbVar.d() != akbVar.d()) {
                    I = 3;
                } else {
                    int iQ = hu.Q(lhrVar, hu.F(joinOrSplitGestureM380m.getJoinOrSplitPoint()), cdsVar);
                    if (iQ != -1) {
                        cgz cgzVarL = lhrVar.l();
                        if (cgzVarL != null) {
                            int iG = cgzVarL.g(iQ);
                            if (iQ == cgzVarL.i(iG)) {
                            }
                        }
                        ahx ahxVarE = akbVar.e();
                        int iCharCount = iQ;
                        while (iCharCount > 0) {
                            int iCodePointBefore = Character.codePointBefore(ahxVarE, iCharCount);
                            if (!hu.G(iCodePointBefore)) {
                                break;
                            } else {
                                iCharCount -= Character.charCount(iCodePointBefore);
                            }
                        }
                        while (iQ < ahxVarE.a()) {
                            int iCodePointAt = Character.codePointAt(ahxVarE, iQ);
                            if (!hu.G(iCodePointAt)) {
                                break;
                            } else {
                                iQ += Character.charCount(iCodePointAt);
                            }
                        }
                        long jN = ccf.N(iCharCount, iQ);
                        if (chb.g(jN)) {
                            akb.n(akbVar, " ", jN, false, 12);
                        } else {
                            hu.K(akbVar, jN, false);
                        }
                        I = 1;
                        i = 1;
                    }
                    I = hu.I(akbVar, joinOrSplitGestureM380m);
                }
                i = 1;
            } else {
                if (fd$$ExternalSyntheticApiModelOutline0.m$1(handwritingGesture)) {
                    InsertGesture insertGestureM379m = fd$$ExternalSyntheticApiModelOutline0.m379m((Object) handwritingGesture);
                    int iQ2 = hu.Q(lhrVar, hu.F(insertGestureM379m.getInsertionPoint()), cdsVar);
                    if (iQ2 == -1) {
                        I = hu.I(akbVar, insertGestureM379m);
                    } else {
                        String textToInsert = insertGestureM379m.getTextToInsert();
                        long jN2 = ccf.N(iQ2, iQ2);
                        long j = chb.a;
                        akb.n(akbVar, textToInsert, jN2, false, 12);
                        I = 1;
                        i = 1;
                    }
                } else if (fd$$ExternalSyntheticApiModelOutline0.m$2(handwritingGesture)) {
                    RemoveSpaceGesture removeSpaceGestureM381m = fd$$ExternalSyntheticApiModelOutline0.m381m((Object) handwritingGesture);
                    cgz cgzVarL2 = lhrVar.l();
                    long jF = hu.F(removeSpaceGestureM381m.getStartPoint());
                    long jF2 = hu.F(removeSpaceGestureM381m.getEndPoint());
                    bvc bvcVarK = lhrVar.k();
                    if (cgzVarL2 == null || bvcVarK == null) {
                        jG = chb.a;
                    } else {
                        long jM = bvcVarK.m(jF);
                        long jM2 = bvcVarK.m(jF2);
                        cgh cghVar = cgzVarL2.b;
                        int iE = hu.E(cghVar, jM, cdsVar);
                        int iE2 = hu.E(cghVar, jM2, cdsVar);
                        if (iE == -1) {
                            if (iE2 == -1) {
                                jG = chb.a;
                            } else {
                                iE = iE2;
                            }
                        } else if (iE2 != -1) {
                            iE = Math.min(iE, iE2);
                        }
                        float fD = cgzVarL2.d(iE) + cgzVarL2.a(iE);
                        int i4 = (int) (jM2 >> 32);
                        int i5 = (int) (jM >> 32);
                        float f = fD / 2.0f;
                        jG = cghVar.g(new bmy(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4)), (-0.1f) + f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4)), f + 0.1f), 0, cgw.a);
                    }
                    if (chb.g(jG)) {
                        I = hu.I(akbVar, removeSpaceGestureM381m);
                    } else {
                        yld yldVar = new yld();
                        yldVar.a = -1;
                        yld yldVar2 = new yld();
                        yldVar2.a = -1;
                        String strO = ccf.O(akbVar.e(), jG);
                        ynj ynjVar = new ynj("\\s+");
                        afk afkVar = new afk(yldVar, yldVar2, 9);
                        strO.getClass();
                        aafi aafiVarG = ynj.g(ynjVar, strO);
                        if (aafiVarG == null) {
                            i = 1;
                        } else {
                            int length = strO.length();
                            StringBuilder sb = new StringBuilder(length);
                            aafi aafiVar = aafiVarG;
                            int i6 = 0;
                            while (true) {
                                i = i3;
                                sb.append((CharSequence) strO, i6, aafiVar.a().f().intValue());
                                aafi aafiVar2 = aafiVar;
                                sb.append((CharSequence) afkVar.a(aafiVar2));
                                iIntValue = aafiVar2.a().e().intValue() + 1;
                                aafi aafiVarE = aafiVar2.e();
                                if (iIntValue >= length || aafiVarE == null) {
                                    break;
                                }
                                aafiVar = aafiVarE;
                                i6 = iIntValue;
                                i3 = i;
                            }
                            if (iIntValue < length) {
                                sb.append((CharSequence) strO, iIntValue, length);
                            }
                            strO = sb.toString();
                        }
                        int i7 = yldVar.a;
                        if (i7 == -1 || (i2 = yldVar2.a) == -1) {
                            I = hu.I(akbVar, removeSpaceGestureM381m);
                        } else {
                            long jN3 = ccf.N(chb.e(jG) + i7, chb.e(jG) + i2);
                            String strSubstring = strO.substring(yldVar.a, strO.length() - (chb.b(jG) - yldVar2.a));
                            strSubstring.getClass();
                            akb.n(akbVar, strSubstring, jN3, false, 12);
                            I = i;
                        }
                    }
                }
                i = 1;
            }
        } else {
            i = 1;
        }
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new csl(intConsumer, I, i));
            } else {
                intConsumer.accept(I);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.d.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        aik aikVar = this.a;
        if (Build.VERSION.SDK_INT >= 34) {
            akb akbVar = aikVar.b;
            lhr lhrVar = aikVar.i;
            int i = 1;
            if (fd$$ExternalSyntheticApiModelOutline0.m388m((Object) previewableHandwritingGesture)) {
                SelectGesture selectGestureM382m = fd$$ExternalSyntheticApiModelOutline0.m382m((Object) previewableHandwritingGesture);
                hu.J(akbVar, hu.R(lhrVar, bnj.q(selectGestureM382m.getSelectionArea()), hu.L(selectGestureM382m.getGranularity()), cgw.b), 0);
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$4(previewableHandwritingGesture)) {
                DeleteGesture deleteGestureM = fd$$ExternalSyntheticApiModelOutline0.m((Object) previewableHandwritingGesture);
                hu.J(akbVar, hu.R(lhrVar, bnj.q(deleteGestureM.getDeletionArea()), hu.L(deleteGestureM.getGranularity()), cgw.b), 1);
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$5(previewableHandwritingGesture)) {
                SelectRangeGesture selectRangeGestureM383m = fd$$ExternalSyntheticApiModelOutline0.m383m((Object) previewableHandwritingGesture);
                hu.J(akbVar, hu.S(lhrVar, bnj.q(selectRangeGestureM383m.getSelectionStartArea()), bnj.q(selectRangeGestureM383m.getSelectionEndArea()), hu.L(selectRangeGestureM383m.getGranularity()), cgw.b), 0);
            } else if (fd$$ExternalSyntheticApiModelOutline0.m$3(previewableHandwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureM378m = fd$$ExternalSyntheticApiModelOutline0.m378m((Object) previewableHandwritingGesture);
                hu.J(akbVar, hu.S(lhrVar, bnj.q(deleteRangeGestureM378m.getDeletionStartArea()), bnj.q(deleteRangeGestureM378m.getDeletionEndArea()), hu.L(deleteRangeGestureM378m.getGranularity()), cgw.b), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new cem(akbVar, i));
            }
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        CursorAnchorInfo cursorAnchorInfoA;
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z5 = (i & 4) != 0;
            if (Build.VERSION.SDK_INT >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z5 || z4) {
                boolean z6 = z5;
                z = z4;
                z4 = z6;
            } else if (Build.VERSION.SDK_INT >= 34) {
                z2 = true;
                z3 = true;
                z4 = true;
                z = true;
            } else {
                z = z4;
                z2 = true;
                z3 = true;
                z4 = true;
            }
        } else {
            z = false;
            z2 = true;
            z3 = true;
        }
        int i2 = i & 1;
        aiu aiuVar = this.a.e;
        aiuVar.c = z2;
        aiuVar.d = z3;
        aiuVar.e = z4;
        aiuVar.f = z;
        if (i2 != 0 && (cursorAnchorInfoA = aiuVar.a()) != null) {
            aiuVar.g.c(cursorAnchorInfoA);
        }
        if ((i & 2) != 0) {
            yqe yqeVar = aiuVar.b;
            if (yqeVar == null || !yqeVar.u()) {
                aiuVar.b = ykr.q(aiuVar.a, null, 4, new qy(aiuVar, (yih) null, 17), 1);
            }
        } else {
            yqe yqeVar2 = aiuVar.b;
            if (yqeVar2 != null) {
                yqeVar2.t(null);
            }
            aiuVar.b = null;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        this.a.h.d(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        this.a.a(new aiz(i, i2, 2));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d A[PHI: r14
  0x012d: PHI (r14v6 ciy) = (r14v12 ciy), (r14v13 ciy), (r14v14 ciy), (r14v15 ciy), (r14v16 ciy) binds: [B:38:0x012b, B:41:0x0138, B:44:0x0143, B:47:0x014e, B:60:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setComposingText(java.lang.CharSequence r31, int r32) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajf.setComposingText(java.lang.CharSequence, int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        hu.C(this.a, i, i2);
        return true;
    }
}
