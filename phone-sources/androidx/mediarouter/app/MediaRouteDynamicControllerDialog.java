package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.dt;
import defpackage.du;
import defpackage.ee;
import defpackage.et;
import defpackage.eu;
import defpackage.ftw;
import defpackage.fui;
import defpackage.fuk;
import defpackage.fun;
import defpackage.fur;
import defpackage.fus;
import defpackage.fuu;
import defpackage.fux;
import defpackage.fuy;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteDynamicControllerDialog extends AppCompatDialog {
    private final MediaRouterCallback A;
    private fur B;
    private boolean C;
    private boolean D;
    private long E;
    private boolean F;
    private boolean G;
    private ImageButton H;
    private Button I;
    private ImageView J;
    private View K;
    private TextView L;
    private TextView M;
    private String N;
    final fuy a;
    fux b;
    final List c;
    final List d;
    final List e;
    final List f;
    Context g;
    final Handler h;
    RecyclerView i;
    RecyclerAdapter j;
    VolumeChangeListener k;
    Map l;
    fux m;
    Map n;
    boolean o;
    ImageView p;
    MediaControllerCallback q;
    dt r;
    FetchArtTask s;
    Bitmap t;
    Uri u;
    boolean v;
    Bitmap w;
    int x;
    final boolean y;
    eu z;

    /* compiled from: PG */
    class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        public final Bitmap a;
        public final Uri b;
        private int d;

        public FetchArtTask() {
            dt dtVar = MediaRouteDynamicControllerDialog.this.r;
            Bitmap bitmap = dtVar == null ? null : dtVar.c;
            if (MediaRouteDynamicControllerDialog.i(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.a = bitmap;
            dt dtVar2 = MediaRouteDynamicControllerDialog.this.r;
            this.b = dtVar2 != null ? dtVar2.d : null;
        }

        private final InputStream a(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStreamOpenInputStream = MediaRouteDynamicControllerDialog.this.g.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(30000);
                uRLConnectionOpenConnection.setReadTimeout(30000);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0096: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:151), block:B:34:0x0096 */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected final /* bridge */ /* synthetic */ android.graphics.Bitmap doInBackground(java.lang.Void[] r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.FetchArtTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            Bitmap bitmap2 = bitmap;
            mediaRouteDynamicControllerDialog.s = null;
            Bitmap bitmap3 = mediaRouteDynamicControllerDialog.t;
            Bitmap bitmap4 = this.a;
            if (Objects.equals(bitmap3, bitmap4) && Objects.equals(mediaRouteDynamicControllerDialog.u, this.b)) {
                return;
            }
            mediaRouteDynamicControllerDialog.t = bitmap4;
            mediaRouteDynamicControllerDialog.w = bitmap2;
            mediaRouteDynamicControllerDialog.u = this.b;
            mediaRouteDynamicControllerDialog.x = this.d;
            mediaRouteDynamicControllerDialog.v = true;
            mediaRouteDynamicControllerDialog.e();
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            MediaRouteDynamicControllerDialog.this.a();
        }
    }

    /* compiled from: PG */
    final class MediaControllerCallback extends ee {
        public MediaControllerCallback() {
        }

        @Override // defpackage.ee
        public void onMetadataChanged(du duVar) {
            dt dtVarB = duVar == null ? null : duVar.b();
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            mediaRouteDynamicControllerDialog.r = dtVarB;
            mediaRouteDynamicControllerDialog.b();
            mediaRouteDynamicControllerDialog.e();
        }

        @Override // defpackage.ee
        public void onSessionDestroyed() {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            eu euVar = mediaRouteDynamicControllerDialog.z;
            if (euVar != null) {
                euVar.p(mediaRouteDynamicControllerDialog.q);
                mediaRouteDynamicControllerDialog.z = null;
            }
        }
    }

    /* compiled from: PG */
    abstract class MediaRouteVolumeSliderHolder extends RecyclerView.ViewHolder {
        fux a;
        final ImageButton b;
        final MediaRouteVolumeSlider c;

        public MediaRouteVolumeSliderHolder(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            int color;
            int color2;
            super(view);
            this.b = imageButton;
            this.c = mediaRouteVolumeSlider;
            imageButton.setImageDrawable(MediaRouterThemeHelper.i(MediaRouteDynamicControllerDialog.this.g, R.drawable.mr_cast_mute_button));
            Context context = MediaRouteDynamicControllerDialog.this.g;
            if (MediaRouterThemeHelper.p(context)) {
                color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
                color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
            } else {
                color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
                color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
            }
            mediaRouteVolumeSlider.setColor(color, color2);
        }

        final void a(fux fuxVar) {
            this.a = fuxVar;
            int i = fuxVar.n;
            boolean z = i == 0;
            ImageButton imageButton = this.b;
            imageButton.setActivated(z);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.MediaRouteVolumeSliderHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int iMax;
                    MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder = MediaRouteVolumeSliderHolder.this;
                    MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                    if (mediaRouteDynamicControllerDialog.m != null) {
                        mediaRouteDynamicControllerDialog.h.removeMessages(2);
                    }
                    mediaRouteDynamicControllerDialog.m = mediaRouteVolumeSliderHolder.a;
                    boolean zIsActivated = view.isActivated();
                    boolean z2 = !zIsActivated;
                    if (zIsActivated) {
                        Integer num = (Integer) mediaRouteDynamicControllerDialog.n.get(mediaRouteVolumeSliderHolder.a.d);
                        iMax = num == null ? 1 : Math.max(1, num.intValue());
                    } else {
                        iMax = 0;
                    }
                    mediaRouteVolumeSliderHolder.b(z2);
                    mediaRouteVolumeSliderHolder.c.setProgress(iMax);
                    mediaRouteVolumeSliderHolder.a.l(iMax);
                    mediaRouteDynamicControllerDialog.h.sendEmptyMessageDelayed(2, 500L);
                }
            });
            fux fuxVar2 = this.a;
            MediaRouteVolumeSlider mediaRouteVolumeSlider = this.c;
            mediaRouteVolumeSlider.setTag(fuxVar2);
            mediaRouteVolumeSlider.setMax(fuxVar.o);
            mediaRouteVolumeSlider.setProgress(i);
            mediaRouteVolumeSlider.setOnSeekBarChangeListener(MediaRouteDynamicControllerDialog.this.k);
        }

        final void b(boolean z) {
            ImageButton imageButton = this.b;
            if (imageButton.isActivated() == z) {
                return;
            }
            imageButton.setActivated(z);
            if (z) {
                MediaRouteDynamicControllerDialog.this.n.put(this.a.d, Integer.valueOf(this.c.getProgress()));
            } else {
                MediaRouteDynamicControllerDialog.this.n.remove(this.a.d);
            }
        }
    }

    /* compiled from: PG */
    final class MediaRouterCallback extends fus {
        public MediaRouterCallback() {
        }

        @Override // defpackage.fus
        public void onRouteAdded(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicControllerDialog.this.g();
        }

        @Override // defpackage.fus
        public void onRouteChanged(fuy fuyVar, fux fuxVar) {
            fuu fuuVarJ;
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (fuxVar == mediaRouteDynamicControllerDialog.b && fux.w() != null) {
                for (fux fuxVar2 : fuxVar.b.d()) {
                    if (!mediaRouteDynamicControllerDialog.b.k().contains(fuxVar2) && (fuuVarJ = mediaRouteDynamicControllerDialog.b.j()) != null && fuuVarJ.c(fuxVar2) && !mediaRouteDynamicControllerDialog.d.contains(fuxVar2)) {
                        mediaRouteDynamicControllerDialog.h();
                        mediaRouteDynamicControllerDialog.f();
                        return;
                    }
                }
            }
            mediaRouteDynamicControllerDialog.g();
        }

        @Override // defpackage.fus
        public void onRouteRemoved(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicControllerDialog.this.g();
        }

        @Override // defpackage.fus
        public void onRouteSelected(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            mediaRouteDynamicControllerDialog.b = fuxVar;
            mediaRouteDynamicControllerDialog.h();
            mediaRouteDynamicControllerDialog.f();
        }

        @Override // defpackage.fus
        public void onRouteUnselected(fuy fuyVar, fux fuxVar) {
            MediaRouteDynamicControllerDialog.this.g();
        }

        @Override // defpackage.fus
        public void onRouteVolumeChanged(fuy fuyVar, fux fuxVar) {
            MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder;
            int i = fuxVar.n;
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (mediaRouteDynamicControllerDialog.m == fuxVar || (mediaRouteVolumeSliderHolder = (MediaRouteVolumeSliderHolder) mediaRouteDynamicControllerDialog.l.get(fuxVar.d)) == null) {
                return;
            }
            int i2 = mediaRouteVolumeSliderHolder.a.n;
            mediaRouteVolumeSliderHolder.b(i2 == 0);
            mediaRouteVolumeSliderHolder.c.setProgress(i2);
        }
    }

    /* compiled from: PG */
    final class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private final LayoutInflater c;
        private final Drawable d;
        private final Drawable e;
        private final Drawable f;
        private final Drawable g;
        private Item h;
        private final int i;
        private final ArrayList b = new ArrayList();
        private final Interpolator j = new AccelerateDecelerateInterpolator();

        /* compiled from: PG */
        class GroupViewHolder extends RecyclerView.ViewHolder {
            final View a;
            final ImageView b;
            final ProgressBar c;
            final TextView d;
            final float e;
            fux f;

            public GroupViewHolder(View view) {
                super(view);
                this.a = view;
                this.b = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.c = progressBar;
                this.d = (TextView) view.findViewById(R.id.mr_cast_group_name);
                this.e = MediaRouterThemeHelper.a(MediaRouteDynamicControllerDialog.this.g);
                MediaRouterThemeHelper.n(MediaRouteDynamicControllerDialog.this.g, progressBar);
            }
        }

        /* compiled from: PG */
        class GroupVolumeViewHolder extends MediaRouteVolumeSliderHolder {
            public final int e;
            private final TextView g;

            public GroupVolumeViewHolder(View view) throws Resources.NotFoundException {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.g = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = MediaRouteDynamicControllerDialog.this.g.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.e = (int) typedValue.getDimension(displayMetrics);
            }

            final void c(Item item) {
                MediaRouteDynamicControllerDialog.c(this.itemView, RecyclerAdapter.this.e() ? this.e : 0);
                fux fuxVar = (fux) item.getData();
                super.a(fuxVar);
                this.g.setText(fuxVar.e);
            }
        }

        /* compiled from: PG */
        class HeaderViewHolder extends RecyclerView.ViewHolder {
            public final TextView a;

            public HeaderViewHolder(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* compiled from: PG */
        class Item {
            private final Object a;
            private final int b;

            public Item(Object obj, int i) {
                this.a = obj;
                this.b = i;
            }

            public Object getData() {
                return this.a;
            }

            public int getType() {
                return this.b;
            }
        }

        /* compiled from: PG */
        class RouteViewHolder extends MediaRouteVolumeSliderHolder {
            final View e;
            final ImageView f;
            final ProgressBar g;
            final TextView h;
            final RelativeLayout i;
            final CheckBox j;
            final float k;
            final int l;
            final View.OnClickListener m;

            public RouteViewHolder(View view) throws Resources.NotFoundException {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.m = new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.RouteViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        RouteViewHolder routeViewHolder = RouteViewHolder.this;
                        boolean zD = routeViewHolder.d(routeViewHolder.a);
                        boolean z = !zD;
                        boolean zR = routeViewHolder.a.r();
                        if (zD) {
                            fux fuxVar = routeViewHolder.a;
                            if (fuxVar == null) {
                                throw new NullPointerException("route must not be null");
                            }
                            fuy.e();
                            ftw ftwVarA = fuy.a();
                            fuu fuuVarJ = ftwVarA.d.j();
                            if (fuuVarJ == null) {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a member route from a selected non-group route");
                            } else if (!fuuVarJ.e(fuxVar)) {
                                java.util.Objects.toString(fuxVar);
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a non-unselectable member route: ".concat(fuxVar.toString()));
                            } else if (!fuuVarJ.k().contains(fuxVar)) {
                                java.util.Objects.toString(fuxVar);
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a non-in-group member route: ".concat(fuxVar.toString()));
                            } else if (fuuVarJ.k().size() <= 1) {
                                Log.w("AxMediaRouter", "Ignoring attempt to remove the last member route.");
                            } else if (fuuVarJ.t()) {
                                fun funVar = ftwVarA.e;
                                if (!(funVar instanceof fuk)) {
                                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                                }
                                ((fuk) funVar).c(fuxVar.c);
                            } else if (fuuVarJ.b()) {
                                ftwVarA.s();
                                java.util.Objects.toString(fuuVarJ);
                                Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: ".concat(fuuVarJ.toString()));
                            } else {
                                java.util.Objects.toString(fuuVarJ);
                                Log.w("AxMediaRouter", "Ignoring attempt to remove a route from an unsupported group route:".concat(fuuVarJ.toString()));
                            }
                        } else {
                            fux fuxVar2 = routeViewHolder.a;
                            if (fuxVar2 == null) {
                                throw new NullPointerException("route must not be null");
                            }
                            fuy.e();
                            ftw ftwVarA2 = fuy.a();
                            fuu fuuVarJ2 = ftwVarA2.d.j();
                            if (fuuVarJ2 == null) {
                                Log.w("AxMediaRouter", "Ignoring attempt to add a member route to a selected non-group route");
                            } else if (!fuuVarJ2.c(fuxVar2)) {
                                java.util.Objects.toString(fuxVar2);
                                Log.w("AxMediaRouter", "Ignoring attempt to add a non-groupable member route: ".concat(fuxVar2.toString()));
                            } else if (fuuVarJ2.k().contains(fuxVar2)) {
                                java.util.Objects.toString(fuxVar2);
                                Log.w("AxMediaRouter", "Ignoring attempt to add an existing member route: ".concat(fuxVar2.toString()));
                            } else if (fuuVarJ2.t()) {
                                fun funVar2 = ftwVarA2.e;
                                if (!(funVar2 instanceof fuk)) {
                                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                                }
                                ((fuk) funVar2).a(fuxVar2.c);
                            } else if (fuuVarJ2.b()) {
                                ftwVarA2.s();
                                java.util.Objects.toString(fuuVarJ2);
                                Log.w("AxMediaRouter", "Ignoring attempt to add a route to a non-available connected route: ".concat(fuuVarJ2.toString()));
                            } else {
                                java.util.Objects.toString(fuuVarJ2);
                                Log.w("AxMediaRouter", "Ignoring attempt to add a route to an unsupported group route:".concat(fuuVarJ2.toString()));
                            }
                        }
                        routeViewHolder.c(z, !zR);
                        if (zR) {
                            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                            List listK = mediaRouteDynamicControllerDialog.b.k();
                            for (fux fuxVar3 : routeViewHolder.a.k()) {
                                if (listK.contains(fuxVar3) != z) {
                                    MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder = (MediaRouteVolumeSliderHolder) mediaRouteDynamicControllerDialog.l.get(fuxVar3.d);
                                    if (mediaRouteVolumeSliderHolder instanceof RouteViewHolder) {
                                        ((RouteViewHolder) mediaRouteVolumeSliderHolder).c(z, true);
                                    }
                                }
                            }
                        }
                        RecyclerAdapter recyclerAdapter = RecyclerAdapter.this;
                        fux fuxVar4 = routeViewHolder.a;
                        MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog2 = MediaRouteDynamicControllerDialog.this;
                        List listK2 = mediaRouteDynamicControllerDialog2.b.k();
                        int iMax = Math.max(1, listK2.size());
                        if (fuxVar4.r()) {
                            Iterator it = fuxVar4.k().iterator();
                            while (it.hasNext()) {
                                if (listK2.contains((fux) it.next()) != z) {
                                    iMax += true != z ? -1 : 1;
                                }
                            }
                        } else {
                            iMax += true == z ? 1 : -1;
                        }
                        boolean zE = recyclerAdapter.e();
                        boolean z2 = mediaRouteDynamicControllerDialog2.y && iMax >= 2;
                        if (zE != z2) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = mediaRouteDynamicControllerDialog2.i.findViewHolderForAdapterPosition(0);
                            if (viewHolderFindViewHolderForAdapterPosition instanceof GroupVolumeViewHolder) {
                                GroupVolumeViewHolder groupVolumeViewHolder = (GroupVolumeViewHolder) viewHolderFindViewHolderForAdapterPosition;
                                recyclerAdapter.b(groupVolumeViewHolder.itemView, z2 ? groupVolumeViewHolder.e : 0);
                            }
                        }
                    }
                };
                this.e = view;
                this.f = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.g = progressBar;
                this.h = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.i = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.j = checkBox;
                checkBox.setButtonDrawable(MediaRouterThemeHelper.i(MediaRouteDynamicControllerDialog.this.g, R.drawable.mr_cast_checkbox));
                MediaRouterThemeHelper.n(MediaRouteDynamicControllerDialog.this.g, progressBar);
                this.k = MediaRouterThemeHelper.a(MediaRouteDynamicControllerDialog.this.g);
                Resources resources = MediaRouteDynamicControllerDialog.this.g.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.l = (int) typedValue.getDimension(displayMetrics);
            }

            final void c(boolean z, boolean z2) {
                CheckBox checkBox = this.j;
                checkBox.setEnabled(false);
                this.e.setEnabled(false);
                checkBox.setChecked(z);
                if (z) {
                    this.f.setVisibility(4);
                    this.g.setVisibility(0);
                }
                if (z2) {
                    RecyclerAdapter.this.b(this.i, z ? this.l : 0);
                }
            }

            final boolean d(fux fuxVar) {
                if (fuxVar.t()) {
                    return true;
                }
                fuu fuuVarJ = MediaRouteDynamicControllerDialog.this.b.j();
                if (fuuVarJ == null) {
                    return false;
                }
                fui fuiVar = (fui) fuuVarJ.a.get(fuxVar.d);
                return fuiVar != null && fuiVar.b == 3;
            }
        }

        public RecyclerAdapter() {
            this.c = LayoutInflater.from(MediaRouteDynamicControllerDialog.this.g);
            this.d = MediaRouterThemeHelper.h(MediaRouteDynamicControllerDialog.this.g);
            this.e = MediaRouterThemeHelper.l(MediaRouteDynamicControllerDialog.this.g);
            this.f = MediaRouterThemeHelper.j(MediaRouteDynamicControllerDialog.this.g);
            this.g = MediaRouterThemeHelper.k(MediaRouteDynamicControllerDialog.this.g);
            this.i = MediaRouteDynamicControllerDialog.this.g.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            d();
        }

        final Drawable a(fux fuxVar) {
            Uri uri = fuxVar.g;
            if (uri != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(MediaRouteDynamicControllerDialog.this.g.getContentResolver().openInputStream(uri), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e) {
                    java.util.Objects.toString(uri);
                    Log.w("MediaRouteCtrlDialog", "Failed to load ".concat(uri.toString()), e);
                }
            }
            int i = fuxVar.m;
            return i != 1 ? i != 2 ? fuxVar.r() ? this.g : this.d : this.f : this.e;
        }

        final void b(final View view, final int i) {
            final int i2 = view.getLayoutParams().height;
            Animation animation = new Animation() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.1
                @Override // android.view.animation.Animation
                protected final void applyTransformation(float f, Transformation transformation) {
                    int i3 = i;
                    MediaRouteDynamicControllerDialog.c(view, i2 + ((int) ((i3 - r0) * f)));
                }
            };
            animation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation2) {
                    MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                    mediaRouteDynamicControllerDialog.o = false;
                    mediaRouteDynamicControllerDialog.h();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation2) {
                    MediaRouteDynamicControllerDialog.this.o = true;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation2) {
                }
            });
            animation.setDuration(this.i);
            animation.setInterpolator(this.j);
            view.startAnimation(animation);
        }

        final void c() {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            List list = mediaRouteDynamicControllerDialog.f;
            list.clear();
            ArrayList arrayList = new ArrayList();
            fuu fuuVarJ = mediaRouteDynamicControllerDialog.b.j();
            if (fuuVarJ != null) {
                for (fux fuxVar : mediaRouteDynamicControllerDialog.b.b.d()) {
                    if (fuuVarJ.c(fuxVar)) {
                        arrayList.add(fuxVar);
                    }
                }
            }
            list.addAll(MediaRouteDialogHelper.getItemsRemoved(mediaRouteDynamicControllerDialog.d, arrayList));
            notifyDataSetChanged();
        }

        final void d() {
            ArrayList arrayList = this.b;
            arrayList.clear();
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            this.h = new Item(mediaRouteDynamicControllerDialog.b, 1);
            List list = mediaRouteDynamicControllerDialog.c;
            if (list.isEmpty()) {
                arrayList.add(new Item(mediaRouteDynamicControllerDialog.b, 3));
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Item((fux) it.next(), 3));
                }
            }
            List<fux> list2 = mediaRouteDynamicControllerDialog.d;
            boolean z = false;
            if (!list2.isEmpty()) {
                boolean z2 = false;
                for (fux fuxVar : list2) {
                    if (!list.contains(fuxVar)) {
                        if (!z2) {
                            fuk fukVarW = fux.w();
                            String strI = fukVarW != null ? fukVarW.i() : null;
                            if (TextUtils.isEmpty(strI)) {
                                strI = mediaRouteDynamicControllerDialog.g.getString(R.string.mr_dialog_groupable_header);
                            }
                            arrayList.add(new Item(strI, 2));
                        }
                        arrayList.add(new Item(fuxVar, 3));
                        z2 = true;
                    }
                }
            }
            List<fux> list3 = mediaRouteDynamicControllerDialog.e;
            if (!list3.isEmpty()) {
                for (fux fuxVar2 : list3) {
                    if (mediaRouteDynamicControllerDialog.b != fuxVar2) {
                        if (!z) {
                            fuk fukVarW2 = fux.w();
                            String strJ = fukVarW2 != null ? fukVarW2.j() : null;
                            if (TextUtils.isEmpty(strJ)) {
                                strJ = mediaRouteDynamicControllerDialog.g.getString(R.string.mr_dialog_transferable_header);
                            }
                            arrayList.add(new Item(strJ, 2));
                        }
                        arrayList.add(new Item(fuxVar2, 4));
                        z = true;
                    }
                }
            }
            c();
        }

        final boolean e() {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            return mediaRouteDynamicControllerDialog.y && mediaRouteDynamicControllerDialog.b.k().size() > 1;
        }

        public Item getItem(int i) {
            return i == 0 ? this.h : (Item) this.b.get(i - 1);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.b.size() + 1;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return getItem(i).getType();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            fuu fuuVarJ;
            int itemViewType = getItemViewType(i);
            Item item = getItem(i);
            boolean z = true;
            if (itemViewType == 1) {
                MediaRouteDynamicControllerDialog.this.l.put(((fux) item.getData()).d, (MediaRouteVolumeSliderHolder) viewHolder);
                ((GroupVolumeViewHolder) viewHolder).c(item);
                return;
            }
            if (itemViewType == 2) {
                ((HeaderViewHolder) viewHolder).a.setText(item.getData().toString());
                return;
            }
            int i2 = 0;
            if (itemViewType != 3) {
                if (itemViewType != 4) {
                    throw new IllegalStateException();
                }
                final GroupViewHolder groupViewHolder = (GroupViewHolder) viewHolder;
                fux fuxVar = (fux) item.getData();
                groupViewHolder.f = fuxVar;
                ImageView imageView = groupViewHolder.b;
                imageView.setVisibility(0);
                groupViewHolder.c.setVisibility(4);
                RecyclerAdapter recyclerAdapter = RecyclerAdapter.this;
                List listK = MediaRouteDynamicControllerDialog.this.b.k();
                if (listK.size() == 1 && listK.get(0) == fuxVar) {
                    z = false;
                }
                View view = groupViewHolder.a;
                view.setAlpha(z ? 1.0f : groupViewHolder.e);
                view.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.GroupViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        GroupViewHolder groupViewHolder2 = GroupViewHolder.this;
                        fux fuxVar2 = groupViewHolder2.f;
                        if (fuxVar2 == null) {
                            throw new NullPointerException("route must not be null");
                        }
                        fuy.e();
                        ftw ftwVarA = fuy.a();
                        fuu fuuVarJ2 = ftwVarA.d.j();
                        if (fuuVarJ2 == null) {
                            Log.w("AxMediaRouter", "Ignoring attempt to transfer for a selected non-group route");
                        } else {
                            List<fux> listSingletonList = Collections.singletonList(fuxVar2);
                            ArrayList arrayList = new ArrayList();
                            for (fux fuxVar3 : listSingletonList) {
                                if (fuuVarJ2.d(fuxVar3)) {
                                    arrayList.add(fuxVar3.c);
                                } else {
                                    java.util.Objects.toString(fuxVar3);
                                    Log.w("AxMediaRouter", "Ignoring attempt to update the group with a non-transferable route: ".concat(String.valueOf(fuxVar3)));
                                }
                            }
                            if (arrayList.isEmpty()) {
                                Log.w("AxMediaRouter", "Ignoring attempt to update the group with non-transferable routes");
                            } else if (fuuVarJ2.t()) {
                                fun funVar = ftwVarA.e;
                                if (!(funVar instanceof fuk)) {
                                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                                }
                                ((fuk) funVar).e(arrayList);
                            } else if (fuuVarJ2.b()) {
                                ftwVarA.s();
                                java.util.Objects.toString(fuuVarJ2);
                                Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: ".concat(fuuVarJ2.toString()));
                            } else {
                                java.util.Objects.toString(fuuVarJ2);
                                Log.w("AxMediaRouter", "Ignoring attempt to update routes for an unsupported group route:".concat(fuuVarJ2.toString()));
                            }
                        }
                        groupViewHolder2.b.setVisibility(4);
                        groupViewHolder2.c.setVisibility(0);
                    }
                });
                imageView.setImageDrawable(recyclerAdapter.a(fuxVar));
                groupViewHolder.d.setText(fuxVar.e);
                return;
            }
            MediaRouteDynamicControllerDialog.this.l.put(((fux) item.getData()).d, (MediaRouteVolumeSliderHolder) viewHolder);
            RouteViewHolder routeViewHolder = (RouteViewHolder) viewHolder;
            fux fuxVar2 = (fux) item.getData();
            RecyclerAdapter recyclerAdapter2 = RecyclerAdapter.this;
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (fuxVar2 == mediaRouteDynamicControllerDialog.b && fuxVar2.k().size() > 0) {
                Iterator it = fuxVar2.k().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    fux fuxVar3 = (fux) it.next();
                    if (!mediaRouteDynamicControllerDialog.d.contains(fuxVar3)) {
                        fuxVar2 = fuxVar3;
                        break;
                    }
                }
            }
            routeViewHolder.a(fuxVar2);
            ImageView imageView2 = routeViewHolder.f;
            imageView2.setImageDrawable(recyclerAdapter2.a(fuxVar2));
            routeViewHolder.h.setText(fuxVar2.e);
            CheckBox checkBox = routeViewHolder.j;
            checkBox.setVisibility(0);
            boolean zD = routeViewHolder.d(fuxVar2);
            boolean z2 = !mediaRouteDynamicControllerDialog.f.contains(fuxVar2) && (!routeViewHolder.d(fuxVar2) || mediaRouteDynamicControllerDialog.b.k().size() >= 2) && (!routeViewHolder.d(fuxVar2) || ((fuuVarJ = mediaRouteDynamicControllerDialog.b.j()) != null && fuuVarJ.e(fuxVar2)));
            checkBox.setChecked(zD);
            routeViewHolder.g.setVisibility(4);
            imageView2.setVisibility(0);
            View view2 = routeViewHolder.e;
            view2.setEnabled(z2);
            checkBox.setEnabled(z2);
            routeViewHolder.b.setEnabled(z2 || zD);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = routeViewHolder.c;
            if (!z2 && !zD) {
                z = false;
            }
            mediaRouteVolumeSlider.setEnabled(z);
            View.OnClickListener onClickListener = routeViewHolder.m;
            view2.setOnClickListener(onClickListener);
            checkBox.setOnClickListener(onClickListener);
            RelativeLayout relativeLayout = routeViewHolder.i;
            if (zD && !routeViewHolder.a.r()) {
                i2 = routeViewHolder.l;
            }
            MediaRouteDynamicControllerDialog.c(relativeLayout, i2);
            view2.setAlpha((z2 || zD) ? 1.0f : routeViewHolder.k);
            if (!z2 && zD) {
                f = routeViewHolder.k;
            }
            checkBox.setAlpha(f);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new GroupVolumeViewHolder(this.c.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i == 2) {
                return new HeaderViewHolder(this.c.inflate(R.layout.mr_cast_header_item, viewGroup, false));
            }
            if (i == 3) {
                return new RouteViewHolder(this.c.inflate(R.layout.mr_cast_route_item, viewGroup, false));
            }
            if (i == 4) {
                return new GroupViewHolder(this.c.inflate(R.layout.mr_cast_group_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            MediaRouteDynamicControllerDialog.this.l.values().remove(viewHolder);
        }
    }

    /* compiled from: PG */
    final class RouteComparator implements Comparator<fux> {
        static final RouteComparator a = new RouteComparator();

        @Override // java.util.Comparator
        public int compare(fux fuxVar, fux fuxVar2) {
            return fuxVar.e.compareToIgnoreCase(fuxVar2.e);
        }
    }

    /* compiled from: PG */
    class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        public VolumeChangeListener() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                fux fuxVar = (fux) seekBar.getTag();
                MediaRouteVolumeSliderHolder mediaRouteVolumeSliderHolder = (MediaRouteVolumeSliderHolder) MediaRouteDynamicControllerDialog.this.l.get(fuxVar.d);
                if (mediaRouteVolumeSliderHolder != null) {
                    mediaRouteVolumeSliderHolder.b(i == 0);
                }
                fuxVar.l(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
            if (mediaRouteDynamicControllerDialog.m != null) {
                mediaRouteDynamicControllerDialog.h.removeMessages(2);
            }
            mediaRouteDynamicControllerDialog.m = (fux) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteDynamicControllerDialog.this.h.sendEmptyMessageDelayed(2, 500L);
        }
    }

    public MediaRouteDynamicControllerDialog(Context context) {
        this(context, 0);
    }

    static void c(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    static boolean i(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    private final void j(et etVar) {
        eu euVar = this.z;
        if (euVar != null) {
            euVar.p(this.q);
            this.z = null;
        }
        if (etVar != null && this.D) {
            eu euVar2 = new eu(this.g, etVar);
            this.z = euVar2;
            euVar2.o(this.q);
            du duVarL = this.z.l();
            this.r = duVarL != null ? duVarL.b() : null;
            b();
            e();
        }
    }

    private final boolean k() {
        return (this.m == null && !this.o && this.C) ? false : true;
    }

    final void a() {
        this.v = false;
        this.w = null;
        this.x = 0;
    }

    final void b() {
        dt dtVar = this.r;
        Bitmap bitmap = dtVar == null ? null : dtVar.c;
        Uri uri = dtVar != null ? dtVar.d : null;
        FetchArtTask fetchArtTask = this.s;
        Bitmap bitmap2 = fetchArtTask == null ? this.t : fetchArtTask.a;
        Uri uri2 = fetchArtTask == null ? this.u : fetchArtTask.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            FetchArtTask fetchArtTask2 = this.s;
            if (fetchArtTask2 != null) {
                fetchArtTask2.cancel(true);
            }
            FetchArtTask fetchArtTask3 = new FetchArtTask();
            this.s = fetchArtTask3;
            fetchArtTask3.execute(new Void[0]);
        }
    }

    final void d() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidthForDynamicGroup(this.g), MediaRouteDialogHelper.getDialogHeight(this.g));
        this.t = null;
        this.u = null;
        b();
        e();
        g();
    }

    final void e() {
        if (k()) {
            this.G = true;
            return;
        }
        this.G = false;
        if (!this.b.t() || this.b.q()) {
            dismiss();
        }
        if (!this.v || i(this.w) || this.w == null) {
            if (i(this.w)) {
                Bitmap bitmap = this.w;
                java.util.Objects.toString(bitmap);
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: ".concat(String.valueOf(bitmap)));
            }
            this.p.setVisibility(8);
            this.K.setVisibility(8);
            this.J.setImageBitmap(null);
        } else {
            this.p.setVisibility(0);
            this.p.setImageBitmap(this.w);
            this.p.setBackgroundColor(this.x);
            this.K.setVisibility(0);
            Bitmap bitmap2 = this.w;
            RenderScript renderScriptCreate = RenderScript.create(this.g);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap2);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            Bitmap bitmapCopy = bitmap2.copy(bitmap2.getConfig(), true);
            allocationCreateTyped.copyTo(bitmapCopy);
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
            this.J.setImageBitmap(bitmapCopy);
        }
        a();
        dt dtVar = this.r;
        CharSequence charSequence = dtVar == null ? null : dtVar.a;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        dt dtVar2 = this.r;
        CharSequence charSequence2 = dtVar2 != null ? dtVar2.b : null;
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
        if (zIsEmpty) {
            this.L.setText(this.N);
        } else {
            this.L.setText(charSequence);
        }
        if (zIsEmpty2) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(charSequence2);
            this.M.setVisibility(0);
        }
    }

    final void f() {
        List list = this.c;
        list.clear();
        List<fux> list2 = this.d;
        list2.clear();
        List<fux> list3 = this.e;
        list3.clear();
        list.addAll(this.b.k());
        fuu fuuVarJ = this.b.j();
        if (fuuVarJ != null) {
            for (fux fuxVar : this.b.b.d()) {
                if (fuuVarJ.c(fuxVar)) {
                    list2.add(fuxVar);
                }
                if (fuuVarJ.d(fuxVar)) {
                    list3.add(fuxVar);
                }
            }
        }
        onFilterRoutes(list2);
        onFilterRoutes(list3);
        RouteComparator routeComparator = RouteComparator.a;
        Collections.sort(list, routeComparator);
        Collections.sort(list2, routeComparator);
        Collections.sort(list3, routeComparator);
        this.j.d();
    }

    final void g() {
        if (this.D) {
            if (SystemClock.uptimeMillis() - this.E < 300) {
                Handler handler = this.h;
                handler.removeMessages(1);
                handler.sendEmptyMessageAtTime(1, this.E + 300);
            } else {
                if (k()) {
                    this.F = true;
                    return;
                }
                this.F = false;
                if (!this.b.t() || this.b.q()) {
                    dismiss();
                }
                this.E = SystemClock.uptimeMillis();
                this.j.c();
            }
        }
    }

    public et getMediaSession() {
        eu euVar = this.z;
        if (euVar == null) {
            return null;
        }
        return (et) euVar.c;
    }

    public fur getRouteSelector() {
        return this.B;
    }

    final void h() {
        if (this.F) {
            g();
        }
        if (this.G) {
            e();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D = true;
        this.a.d(this.B, this.A, 1);
        f();
        j(fuy.k());
    }

    @Override // android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        MediaRouterThemeHelper.m(this.g, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.H = imageButton;
        imageButton.setColorFilter(-1);
        this.H.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteDynamicControllerDialog.this.dismiss();
            }
        });
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.I = button;
        button.setTextColor(-1);
        this.I.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                if (mediaRouteDynamicControllerDialog.b.t()) {
                    fuy.q(2);
                }
                mediaRouteDynamicControllerDialog.dismiss();
            }
        });
        this.j = new RecyclerAdapter();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.i = recyclerView;
        recyclerView.setAdapter(this.j);
        this.i.setLayoutManager(new LinearLayoutManager(this.g));
        this.k = new VolumeChangeListener();
        this.l = new HashMap();
        this.n = new HashMap();
        this.J = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.K = findViewById(R.id.mr_cast_meta_black_scrim);
        this.p = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.L = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.M = textView2;
        textView2.setTextColor(-1);
        this.N = this.g.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.C = true;
        d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D = false;
        this.a.f(this.A);
        this.h.removeCallbacksAndMessages(null);
        j(null);
    }

    public boolean onFilterRoute(fux fuxVar) {
        return !fuxVar.q() && fuxVar.h && fuxVar.u(this.B) && this.b != fuxVar;
    }

    public void onFilterRoutes(List<fux> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (!onFilterRoute(list.get(size))) {
                list.remove(size);
            }
        }
    }

    public void setRouteSelector(fur furVar) {
        if (furVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.B.equals(furVar)) {
            return;
        }
        this.B = furVar;
        if (this.D) {
            fuy fuyVar = this.a;
            MediaRouterCallback mediaRouterCallback = this.A;
            fuyVar.f(mediaRouterCallback);
            fuyVar.d(furVar, mediaRouterCallback, 1);
            f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaRouteDynamicControllerDialog(Context context, int i) {
        Context contextG = MediaRouterThemeHelper.g(context, i, false);
        super(contextG, MediaRouterThemeHelper.b(contextG));
        this.B = fur.a;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new Handler() { // from class: androidx.mediarouter.app.MediaRouteDynamicControllerDialog.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    MediaRouteDynamicControllerDialog.this.g();
                    return;
                }
                if (i2 != 2) {
                    return;
                }
                MediaRouteDynamicControllerDialog mediaRouteDynamicControllerDialog = MediaRouteDynamicControllerDialog.this;
                if (mediaRouteDynamicControllerDialog.m != null) {
                    mediaRouteDynamicControllerDialog.m = null;
                    mediaRouteDynamicControllerDialog.h();
                }
            }
        };
        Context context2 = getContext();
        this.g = context2;
        this.a = fuy.b(context2);
        this.y = fuy.g();
        this.A = new MediaRouterCallback();
        this.b = fuy.n();
        this.q = new MediaControllerCallback();
        j(fuy.k());
    }
}
