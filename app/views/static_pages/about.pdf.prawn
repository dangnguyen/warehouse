require 'prawn_monkeypatch'
prawn_document() do |pdf|
  pdf.text "DELIVERY NOTE", :size => 16, :style => :bold
  pdf.text "Customer: ............................................................."
  table_data = [[Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Item code</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Description</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Quantity</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Date</b>", :inline_format => true), Prawn::Table::Cell::Text.new( pdf, [0,0], :content => "<b>Cost</b>", :inline_format => true)],
                   ["2323", "2343", "2343", "2343", "2343"],
                   ["2323", "2343", "2343", "2343", "2343"]]

    pdf.table(table_data,:width => 500)
end