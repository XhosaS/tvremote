package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qow extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        vgu vguVar = (vgu) obj;
        switch (vguVar) {
            case IMPORTANCE_UNSPECIFIED:
                return vkd.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return vkd.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return vkd.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return vkd.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return vkd.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return vkd.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return vkd.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vguVar))));
        }
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vkd vkdVar = (vkd) obj;
        switch (vkdVar) {
            case IMPORTANCE_UNSPECIFIED:
                return vgu.IMPORTANCE_UNSPECIFIED;
            case IMPORTANCE_NONE:
                return vgu.IMPORTANCE_NONE;
            case IMPORTANCE_DEFAULT:
                return vgu.IMPORTANCE_DEFAULT;
            case IMPORTANCE_HIGH:
                return vgu.IMPORTANCE_HIGH;
            case IMPORTANCE_LOW:
                return vgu.IMPORTANCE_LOW;
            case IMPORTANCE_MAX:
                return vgu.IMPORTANCE_MAX;
            case IMPORTANCE_MIN:
                return vgu.IMPORTANCE_MIN;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vkdVar))));
        }
    }
}
