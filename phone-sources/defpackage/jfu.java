package defpackage;

import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jfu implements sck {
    public final /* synthetic */ sbx a;
    private final /* synthetic */ int b;

    public /* synthetic */ jfu(sbx sbxVar, int i) {
        this.b = i;
        this.a = sbxVar;
    }

    @Override // defpackage.sck
    public final void a(Object obj, View view) {
        int i = this.b;
        Integer numValueOf = Integer.valueOf(R.id.download_view);
        switch (i) {
            case 0:
                view.getClass();
                ((jfv) this.a).a.g(view, yfm.s(Integer.valueOf(R.id.image), Integer.valueOf(R.id.info_section)));
                break;
            case 1:
                view.getClass();
                ((ivd) this.a).d.g(view, yfm.s(Integer.valueOf(R.id.companion_bar_disconnect), Integer.valueOf(R.id.companion_bar_remote), Integer.valueOf(R.id.back_event), Integer.valueOf(R.id.home_event), Integer.valueOf(R.id.assistant_button), Integer.valueOf(R.id.mute_event), Integer.valueOf(R.id.lower_volume_event), Integer.valueOf(R.id.increase_volume_event), Integer.valueOf(R.id.keyboard_button), Integer.valueOf(R.id.power_button), Integer.valueOf(R.id.trackpad_view), Integer.valueOf(R.id.dpad_view), Integer.valueOf(R.id.replay), Integer.valueOf(R.id.forward), Integer.valueOf(R.id.remote_play_button), Integer.valueOf(R.id.media_rewind_button), Integer.valueOf(R.id.media_play_button), Integer.valueOf(R.id.media_forward_button), Integer.valueOf(R.id.media_mute_button), Integer.valueOf(R.id.media_decrease_volume_button), Integer.valueOf(R.id.media_increase_volume_button), Integer.valueOf(R.id.fmr_mode), Integer.valueOf(R.id.overflow_menu)));
                break;
            case 2:
                view.getClass();
                ((jif) this.a).b.g(view, yfm.s(Integer.valueOf(R.id.purchase_button_container), Integer.valueOf(R.id.thumbnail_frame), numValueOf));
                break;
            case 3:
                view.getClass();
                ((jjq) this.a).a.g(view, yhb.a);
                break;
            case 4:
                jlw jlwVar = (jlw) this.a;
                if (jlwVar.p) {
                    ExoPlayer exoPlayer = jlwVar.h;
                    if (exoPlayer != null) {
                        exoPlayer.ab(false);
                    }
                    ExoPlayer exoPlayer2 = jlwVar.h;
                    jlwVar.o = exoPlayer2 != null ? exoPlayer2.D() : 0L;
                }
                jaf jafVar = jlwVar.c;
                view.getClass();
                jafVar.g(view, yfm.p(Integer.valueOf(R.id.trailer_button)));
                break;
            case 5:
                view.getClass();
                ((jsq) this.a).a.g(view, yfm.p(Integer.valueOf(R.id.banner_title_button)));
                break;
            case 6:
                view.getClass();
                ((jwa) this.a).a.g(view, yfm.s(Integer.valueOf(R.id.watch_list_icon), Integer.valueOf(R.id.play_icon), numValueOf));
                break;
            case 7:
                view.getClass();
                ((kdp) this.a).a.g(view, yhb.a);
                break;
            case 8:
                try {
                    Object obj2 = ((moi) this.a).b.b;
                    ((pke) obj2).a(view.findViewById(R.id.download_icon));
                    ((pke) obj2).a(view.findViewById(R.id.play_button));
                    ((pke) obj2).a(view);
                    break;
                } catch (Exception e) {
                    krd.c("Error detach logging view in library movie presenter ".concat(String.valueOf(e.getMessage())));
                    return;
                }
            case 9:
                try {
                    ((pke) ((moy) this.a).a.b).a(view);
                    break;
                } catch (Exception e2) {
                    krd.c("Error detach logging view in library movie presenter ".concat(String.valueOf(e2.getMessage())));
                    return;
                }
            default:
                try {
                    Object obj3 = ((mps) this.a).a.b;
                    ((pke) obj3).a(view.findViewById(R.id.view_mode));
                    ((pke) obj3).a(view.findViewById(R.id.sort_option));
                    break;
                } catch (Exception e3) {
                    krd.c("Error detach logging view in library sort section presenter ".concat(String.valueOf(e3.getMessage())));
                    return;
                }
        }
    }
}
