package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgp implements vuh {
    private final /* synthetic */ int v;
    public static final vuh u = new vgp(20);
    public static final vuh t = new vgp(19);
    public static final vuh s = new vgp(18);
    public static final vuh r = new vgp(17);
    public static final vuh q = new vgp(16);
    public static final vuh p = new vgp(15);
    public static final vuh o = new vgp(14);
    public static final vuh n = new vgp(13);
    public static final vuh m = new vgp(12);
    public static final vuh l = new vgp(11);
    public static final vuh k = new vgp(10);
    public static final vuh j = new vgp(9);
    public static final vuh i = new vgp(8);
    public static final vuh h = new vgp(7);
    public static final vuh g = new vgp(6);
    public static final vuh f = new vgp(5);
    public static final vuh e = new vgp(4);
    public static final vuh d = new vgp(3);
    public static final vuh c = new vgp(2);
    public static final vuh b = new vgp(1);
    public static final vuh a = new vgp(0);

    private vgp(int i2) {
        this.v = i2;
    }

    @Override // defpackage.vuh
    public final boolean a(int i2) {
        Enum r2 = null;
        switch (this.v) {
            case 1:
                if (a.bd(i2) != 0) {
                }
                break;
            case 2:
                if (i2 == 0) {
                    r2 = vgr.CHANNEL_GROUP_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r2 = vgr.ALLOWED;
                } else if (i2 == 2) {
                    r2 = vgr.BANNED;
                }
                if (r2 != null) {
                }
                break;
            case 3:
                if (i2 == 0) {
                    r2 = vgt.UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = vgt.TRUE;
                } else if (i2 == 2) {
                    r2 = vgt.FALSE;
                }
                if (r2 != null) {
                }
                break;
            case 4:
                switch (i2) {
                    case 0:
                        r2 = vgu.IMPORTANCE_UNSPECIFIED;
                        break;
                    case 1:
                        r2 = vgu.IMPORTANCE_NONE;
                        break;
                    case 2:
                        r2 = vgu.IMPORTANCE_DEFAULT;
                        break;
                    case 3:
                        r2 = vgu.IMPORTANCE_HIGH;
                        break;
                    case 4:
                        r2 = vgu.IMPORTANCE_LOW;
                        break;
                    case 5:
                        r2 = vgu.IMPORTANCE_MAX;
                        break;
                    case 6:
                        r2 = vgu.IMPORTANCE_MIN;
                        break;
                }
                if (r2 != null) {
                }
                break;
            case 6:
                if (vfi.b(i2) != 0) {
                }
                break;
            case 11:
                switch (i2) {
                    case 0:
                        r2 = vhm.UNKNOWN;
                        break;
                    case 1:
                        r2 = vhm.DELIVERED_FCM_PUSH;
                        break;
                    case 2:
                        r2 = vhm.SCHEDULED_RECEIVER;
                        break;
                    case 3:
                        r2 = vhm.FETCHED_LATEST_THREADS;
                        break;
                    case 4:
                        r2 = vhm.FETCHED_UPDATED_THREADS;
                        break;
                    case 5:
                        r2 = vhm.LOCAL_NOTIFICATION_CREATED;
                        break;
                    case 6:
                        r2 = vhm.LOCAL_NOTIFICATION_UPDATED;
                        break;
                }
                if (r2 != null) {
                }
                break;
            case 12:
                if (i2 == 1000) {
                    r2 = vhp.SEARCH_DISCOVER_DISABLED;
                } else if (i2 == 10001) {
                    r2 = vhp.SEARCH_OUTSIDE_CONTEXT_FENCE;
                } else if (i2 != 10002) {
                    switch (i2) {
                        case 0:
                            r2 = vhp.DROP_REASON_UNKNOWN;
                            break;
                        case 1:
                            r2 = vhp.INVALID_PAYLOAD;
                            break;
                        case 2:
                            r2 = vhp.SILENT_NOTIFICATION;
                            break;
                        case 3:
                            r2 = vhp.USER_SUPPRESSED;
                            break;
                        case 4:
                            r2 = vhp.INVALID_TARGET_STATE;
                            break;
                        case 5:
                            r2 = vhp.WORK_PROFILE;
                            break;
                        case 6:
                            r2 = vhp.HANDLED_BY_APP;
                            break;
                        case 7:
                            r2 = vhp.UNICORN_OR_GRIFFIN_ACCOUNT;
                            break;
                        case 8:
                            r2 = vhp.CLIENT_COUNTERFACTUAL;
                            break;
                        case 9:
                            r2 = vhp.OUT_OF_ORDER_UPDATE;
                            break;
                    }
                } else {
                    r2 = vhp.SEARCH_ACCOUNT_MISSING_OR_MISMATCH;
                }
                if (r2 != null) {
                }
                break;
            case 13:
                if (vhq.b(i2) != null) {
                }
                break;
            case 14:
                if (i2 == 0) {
                    r2 = vhr.IMAGE_TYPE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = vhr.COLLAPSED_ICON;
                } else if (i2 == 2) {
                    r2 = vhr.EXPANDED_ICON;
                } else if (i2 == 3) {
                    r2 = vhr.BIG_PICTURE;
                }
                if (r2 != null) {
                }
                break;
            case 16:
                if (vht.b(i2) != null) {
                }
                break;
            case 17:
                if (i2 == 0) {
                    r2 = vhu.APP_BLOCK_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r2 = vhu.ALLOWED;
                } else if (i2 == 2) {
                    r2 = vhu.BANNED;
                }
                if (r2 != null) {
                }
                break;
        }
        return a.bp(i2);
    }
}
