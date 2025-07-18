package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lsx implements tsl {
    public lby a() {
        throw null;
    }

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vcx vcxVar = (vcx) obj;
        switch (vcxVar) {
            case GRADIENT_UNSPECIFIED:
                return lby.GRADIENT_UNSPECIFIED;
            case GRADIENT_BL_TR:
                return lby.GRADIENT_BL_TR;
            case GRADIENT_BOTTOM_TOP:
                return lby.GRADIENT_BOTTOM_TOP;
            case GRADIENT_BR_TL:
                return lby.GRADIENT_BR_TL;
            case GRADIENT_LEFT_RIGHT:
                return lby.GRADIENT_LEFT_RIGHT;
            case GRADIENT_RIGHT_LEFT:
                return lby.GRADIENT_RIGHT_LEFT;
            case GRADIENT_TL_BR:
                return lby.GRADIENT_TL_BR;
            case GRADIENT_TOP_BOTTOM:
                return lby.GRADIENT_TOP_BOTTOM;
            case GRADIENT_TR_BL:
                return lby.GRADIENT_TR_BL;
            case UNRECOGNIZED:
                return a();
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vcxVar))));
        }
    }
}
