package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum nne {
    TRANSITION_VALUE_TYPE_NONE,
    TRANSITION_VALUE_TYPE_X_Y,
    TRANSITION_VALUE_TYPE_WIDTH_HEIGHT,
    TRANSITION_VALUE_TYPE_SCALE,
    TRANSITION_VALUE_TYPE_ALPHA,
    TRANSITION_VALUE_TYPE_ROTATION,
    TRANSITION_VALUE_TYPE_TRANSLATION,
    TRANSITION_VALUE_TYPE_TRANSFORM;

    public static nne a(int i2) {
        switch (i2) {
            case 0:
                return TRANSITION_VALUE_TYPE_NONE;
            case 1:
                return TRANSITION_VALUE_TYPE_X_Y;
            case 2:
                return TRANSITION_VALUE_TYPE_WIDTH_HEIGHT;
            case 3:
                return TRANSITION_VALUE_TYPE_SCALE;
            case 4:
                return TRANSITION_VALUE_TYPE_ALPHA;
            case 5:
                return TRANSITION_VALUE_TYPE_ROTATION;
            case 6:
                return TRANSITION_VALUE_TYPE_TRANSLATION;
            case 7:
                return TRANSITION_VALUE_TYPE_TRANSFORM;
            default:
                return null;
        }
    }
}
