package defpackage;

import android.graphics.Rect;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserverConfig;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrh extends mrm {
    private final ArrayList a;
    private final oaa b;
    private final ogq c;
    private final ogq f;
    private boolean g;

    public mrh(nki nkiVar, oaa oaaVar, nzx nzxVar, ogr ogrVar) {
        super(nzxVar);
        this.b = oaaVar;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (!nkiVar.k()) {
            this.c = null;
            this.f = null;
        } else {
            arrayList.add(ogr.n(nkiVar.i()));
            this.c = nkiVar.j() ? ogrVar.o(nkiVar.g(), ((nyv) this.d).h) : null;
            this.f = nkiVar.l() ? ogrVar.o(nkiVar.h(), ((nyv) this.d).h) : null;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status criteriaMatched(ArrayList arrayList) {
        this.g = true;
        ogq ogqVar = this.c;
        if (ogqVar != null) {
            this.b.a(ogqVar.a(), a()).k();
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final IntersectionPropertiesOuterClass$IntersectionObserverConfig getCustomConfig() {
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final String getGroupId() {
        return "";
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final boolean needContinuousUpdate() {
        return this.f != null;
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final Status visibilityChanged(float f, Rect rect, Rect rect2) {
        ogq ogqVar;
        if (this.g && (ogqVar = this.f) != null) {
            float fCenterX = rect.centerX();
            float fCenterY = rect.centerY();
            float fCenterX2 = rect2.centerX();
            float fCenterY2 = rect2.centerY();
            acud acudVar = acud.a;
            acuc acucVar = new acuc();
            if ((acucVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acucVar.y();
            }
            acud acudVar2 = (acud) acucVar.b;
            acudVar2.c |= 1;
            acudVar2.d = f;
            acyb acybVar = acyb.a;
            acya acyaVar = new acya();
            if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyaVar.y();
            }
            acyb acybVar2 = (acyb) acyaVar.b;
            acybVar2.b |= 1;
            acybVar2.c = fCenterX;
            if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyaVar.y();
            }
            acyb acybVar3 = (acyb) acyaVar.b;
            acybVar3.b |= 2;
            acybVar3.d = fCenterY;
            if ((acucVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acucVar.y();
            }
            acud acudVar3 = (acud) acucVar.b;
            acyb acybVar4 = (acyb) acyaVar.v();
            acybVar4.getClass();
            acudVar3.e = acybVar4;
            acudVar3.c |= 2;
            acya acyaVar2 = new acya();
            if ((acyaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyaVar2.y();
            }
            acyb acybVar5 = (acyb) acyaVar2.b;
            acybVar5.b |= 1;
            acybVar5.c = fCenterX2;
            if ((acyaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyaVar2.y();
            }
            acyb acybVar6 = (acyb) acyaVar2.b;
            acybVar6.b |= 2;
            acybVar6.d = fCenterY2;
            if ((acucVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acucVar.y();
            }
            acud acudVar4 = (acud) acucVar.b;
            acyb acybVar7 = (acyb) acyaVar2.v();
            acybVar7.getClass();
            acudVar4.f = acybVar7;
            acudVar4.c |= 4;
            acud acudVar5 = (acud) acucVar.v();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
            acyk acykVar = new acyk();
            acykVar.f(acud.b, acudVar5);
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
            oaa oaaVar = this.b;
            CommandOuterClass$Command commandOuterClass$CommandA = ogqVar.a();
            nzv nzvVarQ = a().q();
            nyu nyuVar = (nyu) nzvVarQ;
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState3 = nyuVar.c;
            if (senderStateOuterClass$SenderState3 != null) {
                acyk acykVar2 = new acyk();
                acykVar2.B(senderStateOuterClass$SenderState3);
                acykVar2.B(senderStateOuterClass$SenderState2);
                senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar2.v();
            }
            nyuVar.c = senderStateOuterClass$SenderState2;
            oaaVar.a(commandOuterClass$CommandA, nzvVarQ.e()).k();
        }
        return Status.OK;
    }
}
